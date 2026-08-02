package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class GifHeaderParser {
    public final byte[] block = new byte[256];
    public int blockSize = 0;
    public GifHeader header;
    public ByteBuffer rawData;

    public final boolean err() {
        return this.header.status != 0;
    }

    public final GifHeader parseHeader() {
        byte[] bArr;
        if (this.rawData == null) {
            a$$ExternalSyntheticBUOutline0.m$1("You must call setData() before parseHeader()");
            return null;
        }
        if (err()) {
            return this.header;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) read());
        }
        boolean startsWith = sb.toString().startsWith("GIF");
        GifHeader gifHeader = this.header;
        if (startsWith) {
            gifHeader.width = this.rawData.getShort();
            this.header.height = this.rawData.getShort();
            int read = read();
            GifHeader gifHeader2 = this.header;
            gifHeader2.gctFlag = (read & 128) != 0;
            gifHeader2.gctSize = (int) Math.pow(2.0d, (read & 7) + 1);
            this.header.bgIndex = read();
            GifHeader gifHeader3 = this.header;
            read();
            gifHeader3.getClass();
            if (this.header.gctFlag && !err()) {
                GifHeader gifHeader4 = this.header;
                gifHeader4.gct = readColorTable(gifHeader4.gctSize);
                GifHeader gifHeader5 = this.header;
                gifHeader5.bgColor = gifHeader5.gct[gifHeader5.bgIndex];
            }
        } else {
            gifHeader.status = 1;
        }
        if (!err()) {
            boolean z = false;
            while (!z && !err() && this.header.frameCount <= Integer.MAX_VALUE) {
                int read2 = read();
                if (read2 == 33) {
                    int read3 = read();
                    if (read3 == 1) {
                        skip();
                    } else if (read3 == 249) {
                        this.header.currentFrame = new GifFrame();
                        read();
                        int read4 = read();
                        GifFrame gifFrame = this.header.currentFrame;
                        int i2 = (read4 & 28) >> 2;
                        gifFrame.dispose = i2;
                        if (i2 == 0) {
                            gifFrame.dispose = 1;
                        }
                        gifFrame.transparency = (read4 & 1) != 0;
                        short s = this.rawData.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        GifFrame gifFrame2 = this.header.currentFrame;
                        gifFrame2.delay = s * 10;
                        gifFrame2.transIndex = read();
                        read();
                    } else if (read3 == 254) {
                        skip();
                    } else if (read3 != 255) {
                        skip();
                    } else {
                        readBlock();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.block;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                readBlock();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.header.getClass();
                                }
                                if (this.blockSize > 0) {
                                }
                            } while (!err());
                        } else {
                            skip();
                        }
                    }
                } else if (read2 == 44) {
                    GifHeader gifHeader6 = this.header;
                    if (gifHeader6.currentFrame == null) {
                        gifHeader6.currentFrame = new GifFrame();
                    }
                    gifHeader6.currentFrame.ix = this.rawData.getShort();
                    this.header.currentFrame.iy = this.rawData.getShort();
                    this.header.currentFrame.iw = this.rawData.getShort();
                    this.header.currentFrame.ih = this.rawData.getShort();
                    int read5 = read();
                    boolean z2 = (read5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (read5 & 7) + 1);
                    GifFrame gifFrame3 = this.header.currentFrame;
                    gifFrame3.interlace = (read5 & 64) != 0;
                    if (z2) {
                        gifFrame3.lct = readColorTable(pow);
                    } else {
                        gifFrame3.lct = null;
                    }
                    this.header.currentFrame.bufferFrameStart = this.rawData.position();
                    read();
                    skip();
                    if (!err()) {
                        GifHeader gifHeader7 = this.header;
                        gifHeader7.frameCount++;
                        gifHeader7.frames.add(gifHeader7.currentFrame);
                    }
                } else if (read2 != 59) {
                    this.header.status = 1;
                } else {
                    z = true;
                }
            }
            GifHeader gifHeader8 = this.header;
            if (gifHeader8.frameCount < 0) {
                gifHeader8.status = 1;
            }
        }
        return this.header;
    }

    public final int read() {
        try {
            return this.rawData.get() & 255;
        } catch (Exception unused) {
            this.header.status = 1;
            return 0;
        }
    }

    public final void readBlock() {
        int read = read();
        this.blockSize = read;
        if (read <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.blockSize;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.rawData.get(this.block, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Error Reading Block n: ", " count: ", " blockSize: ");
                    m107m.append(this.blockSize);
                    Log.d("GifHeaderParser", m107m.toString(), e);
                }
                this.header.status = 1;
                return;
            }
        }
    }

    public final int[] readColorTable(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.rawData.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.header.status = 1;
            return iArr;
        }
    }

    public final void skip() {
        int read;
        do {
            read = read();
            this.rawData.position(Math.min(this.rawData.position() + read, this.rawData.limit()));
        } while (read > 0);
    }
}
