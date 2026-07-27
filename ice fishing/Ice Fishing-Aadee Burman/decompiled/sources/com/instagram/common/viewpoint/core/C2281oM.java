package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.oM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2281oM implements InterfaceC07518z {
    public static boolean A0v;
    public static int A0w;
    public static ExecutorService A0x;
    public static byte[] A0y;
    public static String[] A0z = {"a2KSouRkY2EeYPYlRPuQP1BMARpp6f9O", "Gy", "Dq9VRycV95bIzONst7U9W8VcH5OAT2ac", "T381mgHUGlQbTRbVURm4ZuRF6EOi2D8f", "KkGB0jhfpK5IC", "ogTnlK5ViGnrQ4kTUDUA61bIZynBq2mv", "CJ3ZuNqxaIjwSiQAD7ytgom2H57haWJk", "spWmv2H5WGO5MG6CASCqBbohd0yqIF8X"};
    public static final Object A10;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D23918943: Monitor the audio track usage")
    public static final AtomicInteger A11;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public AudioTrack A0D;
    public C2406qQ A0E;
    public AnonymousClass21 A0F;
    public C2379px A0G;
    public C8O A0H;
    public InterfaceC07488v A0I;
    public C9E A0J;
    public C9H A0K;
    public C9H A0L;
    public C9J A0M;
    public C9J A0N;
    public C9P A0O;
    public ByteBuffer A0P;
    public ByteBuffer A0Q;
    public ByteBuffer A0R;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes")
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public InterfaceC06103k[] A0d;
    public ByteBuffer[] A0e;
    public final int A0f;
    public final InterfaceC06113l A0g;
    public final AnonymousClass48 A0h;
    public final C6W A0i;
    public final C8R A0j;
    public final AnonymousClass95 A0k;
    public final A7 A0l;
    public final C9F A0m;
    public final C9M<C07478t> A0n;
    public final C9M<C07508y> A0o;
    public final C9x A0p;
    public final ArrayDeque<C9J> A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final InterfaceC06103k[] A0t;
    public final InterfaceC06103k[] A0u;

    public static String A0L(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0y, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A0T() {
        A0y = new byte[]{99, 106, 44, 37, 56, 112, 106, 107, 74, 73, 78, 90, 67, 91, 110, 90, 75, 70, c.f16317b, 124, 70, 65, 68, 104, 85, 66, 125, 65, 76, 84, 72, 95, 23, 108, 88, 73, 68, 66, 121, 95, 76, 78, 70, Byte.MAX_VALUE, 72, 65, 72, 76, 94, 72, 121, 69, 95, 72, 76, 73, 39, 0, 8, 13, 4, 5, 65, 21, 14, 65, 18, 4, 21, 65, 17, 13, 0, 24, 3, 0, 2, 10, 65, 17, 0, 19, 0, 12, 18, 121, 94, 70, 81, 92, 89, 84, 16, 96, 115, 125, 16, 85, 94, 83, 95, 84, 89, 94, 87, 10, 16, 73, 110, 118, 97, 108, 105, 100, 32, 111, 117, 116, 112, 117, 116, 32, 99, 104, 97, 110, 110, 101, 108, 32, 99, 111, 110, 102, 105, 103, 32, 40, 109, 111, 100, 101, 61, 57, 30, 6, 17, 28, 25, 20, 80, 31, 5, 4, 0, 5, 4, 80, 21, 30, 19, 31, 20, 25, 30, 23, 80, 88, 29, 31, 20, 21, 77, 33, 24, 9, 20, 29, 104, 95, 73, 95, 78, 78, 83, 84, 93, 26, 73, 78, 91, 86, 86, 95, 94, 26, 91, 79, 94, 83, 85, 26, 78, 72, 91, 89, 81, 117, 78, 65, 66, 76, 69, 0, 84, 79, 0, 67, 79, 78, 70, 73, 71, 85, 82, 69, 0, 80, 65, 83, 83, 84, 72, 82, 79, 85, 71, 72, 0, 70, 79, 82, 26, 0, 124, 71, 76, 81, 89, 76, 74, 93, 76, 77, 9, 72, 92, 77, c.f16317b, 70, 9, 76, 71, 74, 70, 77, c.f16317b, 71, 78, 19, 9, 31, 11, 26, 23, 17, 81, 12, 31, 9};
    }

    static {
        A0T();
        A0v = false;
        A10 = new Object();
        A11 = new AtomicInteger(0);
    }

    @Deprecated
    public C2281oM(C8R c8r, InterfaceC06103k[] interfaceC06103kArr) {
        this(new C9G().A06((C8R) AbstractC2063ka.A00(c8r, C8R.A04)).A07(interfaceC06103kArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @RequiresNonNull({"#1.audioProcessorChain"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2281oM(C9G c9g) {
        C8R c8r;
        InterfaceC06113l interfaceC06113l;
        boolean z3;
        boolean z6;
        int i;
        boolean z9;
        boolean z10;
        c8r = c9g.A03;
        this.A0j = c8r;
        interfaceC06113l = c9g.A02;
        this.A0g = interfaceC06113l;
        if (C5C.A02 >= 21) {
            z10 = c9g.A05;
            if (z10) {
                z3 = true;
                this.A0s = z3;
                if (C5C.A02 >= 23) {
                    z9 = c9g.A04;
                    if (z9) {
                        z6 = true;
                        this.A0r = z6;
                        if (C5C.A02 >= 29) {
                            i = c9g.A01;
                        } else {
                            i = 0;
                        }
                        this.A0f = i;
                        this.A0m = c9g.A00;
                        this.A0h = new AnonymousClass48(AnonymousClass45.A00);
                        this.A0h.A04();
                        this.A0k = new AnonymousClass95(new C2284oP(this));
                        this.A0l = new A7();
                        this.A0p = new C9x();
                        ArrayList arrayList = new ArrayList();
                        Collections.addAll(arrayList, new AbstractC2285oQ() { // from class: com.facebook.ads.redexgen.X.9z
                            public static String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

                            @Override // com.instagram.common.viewpoint.core.AbstractC2285oQ
                            public final C06083i A09(C06083i c06083i) throws C06093j {
                                int i6 = c06083i.A02;
                                if (i6 != 3 && i6 != 2) {
                                    if (A00[2].charAt(30) != 'b') {
                                        throw new RuntimeException();
                                    }
                                    A00[3] = "ty1ASCrQyl5";
                                    if (i6 != 268435456 && i6 != 536870912 && i6 != 805306368 && i6 != 4) {
                                        throw new C06093j(c06083i);
                                    }
                                }
                                if (i6 != 2) {
                                    return new C06083i(c06083i.A03, c06083i.A01, 2);
                                }
                                return C06083i.A05;
                            }

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
                            @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void AHH(ByteBuffer byteBuffer) {
                                int resampledSize = byteBuffer.position();
                                int size = byteBuffer.limit();
                                int limit = size - resampledSize;
                                int position = this.A05.A02;
                                switch (position) {
                                    case 3:
                                        limit *= 2;
                                        break;
                                    case 4:
                                    case 805306368:
                                        limit /= 2;
                                        break;
                                    case 268435456:
                                        break;
                                    case 536870912:
                                        int position2 = limit / 3;
                                        limit = position2 * 2;
                                        break;
                                    default:
                                        throw new IllegalStateException();
                                }
                                ByteBuffer buffer = A00(limit);
                                int position3 = this.A05.A02;
                                switch (position3) {
                                    case 3:
                                        while (resampledSize < size) {
                                            buffer.put((byte) 0);
                                            int position4 = byteBuffer.get(resampledSize);
                                            buffer.put((byte) ((position4 & p.f8473b) - 128));
                                            resampledSize++;
                                        }
                                        int resampledSize2 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                            throw new RuntimeException();
                                        }
                                        A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                                        byteBuffer.position(resampledSize2);
                                        buffer.flip();
                                        return;
                                    case 4:
                                        while (resampledSize < size) {
                                            int position5 = (int) (32767.0f * C5C.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                                            int limit2 = (short) position5;
                                            int position6 = limit2 & p.f8473b;
                                            buffer.put((byte) position6);
                                            int position7 = limit2 >> 8;
                                            buffer.put((byte) (position7 & p.f8473b));
                                            resampledSize += 4;
                                        }
                                        int resampledSize22 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 268435456:
                                        while (resampledSize < size) {
                                            int position8 = resampledSize + 1;
                                            buffer.put(byteBuffer.get(position8));
                                            buffer.put(byteBuffer.get(resampledSize));
                                            resampledSize += 2;
                                        }
                                        int resampledSize222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 536870912:
                                        while (resampledSize < size) {
                                            int position9 = resampledSize + 1;
                                            buffer.put(byteBuffer.get(position9));
                                            int position10 = resampledSize + 2;
                                            buffer.put(byteBuffer.get(position10));
                                            resampledSize += 3;
                                        }
                                        int resampledSize2222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 805306368:
                                        while (resampledSize < size) {
                                            int position11 = resampledSize + 2;
                                            buffer.put(byteBuffer.get(position11));
                                            int position12 = resampledSize + 3;
                                            buffer.put(byteBuffer.get(position12));
                                            resampledSize += 4;
                                        }
                                        int resampledSize22222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    default:
                                        throw new IllegalStateException();
                                }
                            }
                        }, this.A0l, this.A0p);
                        Collections.addAll(arrayList, this.A0g.A6z());
                        this.A0u = (InterfaceC06103k[]) arrayList.toArray(new InterfaceC06103k[0]);
                        this.A0t = new InterfaceC06103k[]{new A0()};
                        this.A00 = 1.0f;
                        this.A0E = C2406qQ.A07;
                        this.A01 = 0;
                        this.A0F = new AnonymousClass21(0, 0.0f);
                        this.A0N = new C9J(C2379px.A06, false, 0L, 0L);
                        this.A0G = C2379px.A06;
                        this.A03 = -1;
                        this.A0d = new InterfaceC06103k[0];
                        this.A0e = new ByteBuffer[0];
                        this.A0q = new ArrayDeque<>();
                        this.A0n = new C9M<>(100L);
                        this.A0o = new C9M<>(100L);
                        this.A0i = null;
                    }
                }
                z6 = false;
                this.A0r = z6;
                if (C5C.A02 >= 29) {
                }
                this.A0f = i;
                this.A0m = c9g.A00;
                this.A0h = new AnonymousClass48(AnonymousClass45.A00);
                this.A0h.A04();
                this.A0k = new AnonymousClass95(new C2284oP(this));
                this.A0l = new A7();
                this.A0p = new C9x();
                ArrayList arrayList2 = new ArrayList();
                Collections.addAll(arrayList2, new AbstractC2285oQ() { // from class: com.facebook.ads.redexgen.X.9z
                    public static String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

                    @Override // com.instagram.common.viewpoint.core.AbstractC2285oQ
                    public final C06083i A09(C06083i c06083i) throws C06093j {
                        int i6 = c06083i.A02;
                        if (i6 != 3 && i6 != 2) {
                            if (A00[2].charAt(30) != 'b') {
                                throw new RuntimeException();
                            }
                            A00[3] = "ty1ASCrQyl5";
                            if (i6 != 268435456 && i6 != 536870912 && i6 != 805306368 && i6 != 4) {
                                throw new C06093j(c06083i);
                            }
                        }
                        if (i6 != 2) {
                            return new C06083i(c06083i.A03, c06083i.A01, 2);
                        }
                        return C06083i.A05;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
                    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void AHH(ByteBuffer byteBuffer) {
                        int resampledSize = byteBuffer.position();
                        int size = byteBuffer.limit();
                        int limit = size - resampledSize;
                        int position = this.A05.A02;
                        switch (position) {
                            case 3:
                                limit *= 2;
                                break;
                            case 4:
                            case 805306368:
                                limit /= 2;
                                break;
                            case 268435456:
                                break;
                            case 536870912:
                                int position2 = limit / 3;
                                limit = position2 * 2;
                                break;
                            default:
                                throw new IllegalStateException();
                        }
                        ByteBuffer buffer = A00(limit);
                        int position3 = this.A05.A02;
                        switch (position3) {
                            case 3:
                                while (resampledSize < size) {
                                    buffer.put((byte) 0);
                                    int position4 = byteBuffer.get(resampledSize);
                                    buffer.put((byte) ((position4 & p.f8473b) - 128));
                                    resampledSize++;
                                }
                                int resampledSize22222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                    throw new RuntimeException();
                                }
                                A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                                byteBuffer.position(resampledSize22222);
                                buffer.flip();
                                return;
                            case 4:
                                while (resampledSize < size) {
                                    int position5 = (int) (32767.0f * C5C.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                                    int limit2 = (short) position5;
                                    int position6 = limit2 & p.f8473b;
                                    buffer.put((byte) position6);
                                    int position7 = limit2 >> 8;
                                    buffer.put((byte) (position7 & p.f8473b));
                                    resampledSize += 4;
                                }
                                int resampledSize222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 268435456:
                                while (resampledSize < size) {
                                    int position8 = resampledSize + 1;
                                    buffer.put(byteBuffer.get(position8));
                                    buffer.put(byteBuffer.get(resampledSize));
                                    resampledSize += 2;
                                }
                                int resampledSize2222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 536870912:
                                while (resampledSize < size) {
                                    int position9 = resampledSize + 1;
                                    buffer.put(byteBuffer.get(position9));
                                    int position10 = resampledSize + 2;
                                    buffer.put(byteBuffer.get(position10));
                                    resampledSize += 3;
                                }
                                int resampledSize22222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 805306368:
                                while (resampledSize < size) {
                                    int position11 = resampledSize + 2;
                                    buffer.put(byteBuffer.get(position11));
                                    int position12 = resampledSize + 3;
                                    buffer.put(byteBuffer.get(position12));
                                    resampledSize += 4;
                                }
                                int resampledSize222222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                }, this.A0l, this.A0p);
                Collections.addAll(arrayList2, this.A0g.A6z());
                this.A0u = (InterfaceC06103k[]) arrayList2.toArray(new InterfaceC06103k[0]);
                this.A0t = new InterfaceC06103k[]{new A0()};
                this.A00 = 1.0f;
                this.A0E = C2406qQ.A07;
                this.A01 = 0;
                this.A0F = new AnonymousClass21(0, 0.0f);
                this.A0N = new C9J(C2379px.A06, false, 0L, 0L);
                this.A0G = C2379px.A06;
                this.A03 = -1;
                this.A0d = new InterfaceC06103k[0];
                this.A0e = new ByteBuffer[0];
                this.A0q = new ArrayDeque<>();
                this.A0n = new C9M<>(100L);
                this.A0o = new C9M<>(100L);
                this.A0i = null;
            }
        }
        z3 = false;
        this.A0s = z3;
        if (C5C.A02 >= 23) {
        }
        z6 = false;
        this.A0r = z6;
        if (C5C.A02 >= 29) {
        }
        this.A0f = i;
        this.A0m = c9g.A00;
        this.A0h = new AnonymousClass48(AnonymousClass45.A00);
        this.A0h.A04();
        this.A0k = new AnonymousClass95(new C2284oP(this));
        this.A0l = new A7();
        this.A0p = new C9x();
        ArrayList arrayList22 = new ArrayList();
        Collections.addAll(arrayList22, new AbstractC2285oQ() { // from class: com.facebook.ads.redexgen.X.9z
            public static String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

            @Override // com.instagram.common.viewpoint.core.AbstractC2285oQ
            public final C06083i A09(C06083i c06083i) throws C06093j {
                int i6 = c06083i.A02;
                if (i6 != 3 && i6 != 2) {
                    if (A00[2].charAt(30) != 'b') {
                        throw new RuntimeException();
                    }
                    A00[3] = "ty1ASCrQyl5";
                    if (i6 != 268435456 && i6 != 536870912 && i6 != 805306368 && i6 != 4) {
                        throw new C06093j(c06083i);
                    }
                }
                if (i6 != 2) {
                    return new C06083i(c06083i.A03, c06083i.A01, 2);
                }
                return C06083i.A05;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
            @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void AHH(ByteBuffer byteBuffer) {
                int resampledSize = byteBuffer.position();
                int size = byteBuffer.limit();
                int limit = size - resampledSize;
                int position = this.A05.A02;
                switch (position) {
                    case 3:
                        limit *= 2;
                        break;
                    case 4:
                    case 805306368:
                        limit /= 2;
                        break;
                    case 268435456:
                        break;
                    case 536870912:
                        int position2 = limit / 3;
                        limit = position2 * 2;
                        break;
                    default:
                        throw new IllegalStateException();
                }
                ByteBuffer buffer = A00(limit);
                int position3 = this.A05.A02;
                switch (position3) {
                    case 3:
                        while (resampledSize < size) {
                            buffer.put((byte) 0);
                            int position4 = byteBuffer.get(resampledSize);
                            buffer.put((byte) ((position4 & p.f8473b) - 128));
                            resampledSize++;
                        }
                        int resampledSize222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                            throw new RuntimeException();
                        }
                        A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                        byteBuffer.position(resampledSize222222222);
                        buffer.flip();
                        return;
                    case 4:
                        while (resampledSize < size) {
                            int position5 = (int) (32767.0f * C5C.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                            int limit2 = (short) position5;
                            int position6 = limit2 & p.f8473b;
                            buffer.put((byte) position6);
                            int position7 = limit2 >> 8;
                            buffer.put((byte) (position7 & p.f8473b));
                            resampledSize += 4;
                        }
                        int resampledSize2222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 268435456:
                        while (resampledSize < size) {
                            int position8 = resampledSize + 1;
                            buffer.put(byteBuffer.get(position8));
                            buffer.put(byteBuffer.get(resampledSize));
                            resampledSize += 2;
                        }
                        int resampledSize22222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 536870912:
                        while (resampledSize < size) {
                            int position9 = resampledSize + 1;
                            buffer.put(byteBuffer.get(position9));
                            int position10 = resampledSize + 2;
                            buffer.put(byteBuffer.get(position10));
                            resampledSize += 3;
                        }
                        int resampledSize222222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 805306368:
                        while (resampledSize < size) {
                            int position11 = resampledSize + 2;
                            buffer.put(byteBuffer.get(position11));
                            int position12 = resampledSize + 3;
                            buffer.put(byteBuffer.get(position12));
                            resampledSize += 4;
                        }
                        int resampledSize2222222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    default:
                        throw new IllegalStateException();
                }
            }
        }, this.A0l, this.A0p);
        Collections.addAll(arrayList22, this.A0g.A6z());
        this.A0u = (InterfaceC06103k[]) arrayList22.toArray(new InterfaceC06103k[0]);
        this.A0t = new InterfaceC06103k[]{new A0()};
        this.A00 = 1.0f;
        this.A0E = C2406qQ.A07;
        this.A01 = 0;
        this.A0F = new AnonymousClass21(0, 0.0f);
        this.A0N = new C9J(C2379px.A06, false, 0L, 0L);
        this.A0G = C2379px.A06;
        this.A03 = -1;
        this.A0d = new InterfaceC06103k[0];
        this.A0e = new ByteBuffer[0];
        this.A0q = new ArrayDeque<>();
        this.A0n = new C9M<>(100L);
        this.A0o = new C9M<>(100L);
        this.A0i = null;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "D58560720: customized audio track retry logic. Feature is available upstream already")
    private int A00() {
        if (MetaExoPlayerUpgradeConfig.A03(EnumC2000jX.A1m)) {
            return A01(this.A0K.A06, this.A0K.A02, this.A0K.A03);
        }
        return 1000000;
    }

    public static int A01(int i, int i6, int i9) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i6, i9);
        AbstractC06243y.A08(minBufferSize != -2);
        return minBufferSize;
    }

    public static int A02(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return AbstractC0935Gr.A03(byteBuffer);
            case 7:
            case 8:
                int headerDataInBigEndian = H7.A00(byteBuffer);
                return headerDataInBigEndian;
            case 9:
                int headerDataInBigEndian2 = C5C.A0F(byteBuffer, byteBuffer.position());
                int headerDataInBigEndian3 = HO.A01(headerDataInBigEndian2);
                if (headerDataInBigEndian3 != -1) {
                    return headerDataInBigEndian3;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException(A0L(244, 27, 17) + i);
            case 14:
                int syncframeOffset = AbstractC0935Gr.A02(byteBuffer);
                if (syncframeOffset == -1) {
                    return 0;
                }
                return AbstractC0935Gr.A04(byteBuffer, syncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return AbstractC0938Gu.A01(byteBuffer);
            case 20:
                return HT.A00(byteBuffer);
        }
    }

    private int A03(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        if (C5C.A02 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        if (C5C.A02 != 30) {
            return 1;
        }
        String str = C5C.A06;
        String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        A0z[7] = "3tkRuQxdBcZlCTwsgu7cjpWlPYr81dQa";
        if (!str.startsWith(A0L(173, 5, 73))) {
            return 1;
        }
        if (A0z[7].length() != 32) {
            return 2;
        }
        A0z[7] = "7yaDe65lYY86qlvGhmsANLPH6jvNYU2p";
        return 2;
    }

    public static int A04(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int A05(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j6) {
        if (C5C.A02 >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j6 * 1000);
        }
        if (this.A0P == null) {
            this.A0P = ByteBuffer.allocate(16);
            this.A0P.order(ByteOrder.BIG_ENDIAN);
            this.A0P.putInt(1431633921);
        }
        if (this.A02 == 0) {
            this.A0P.putInt(4, i);
            this.A0P.putLong(8, 1000 * j6);
            this.A0P.position(0);
            this.A02 = i;
        }
        int result = this.A0P.remaining();
        if (result > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0P, result, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A02 = 0;
                return avSyncHeaderBytesRemaining;
            }
            if (avSyncHeaderBytesRemaining < result) {
                return 0;
            }
        }
        int A04 = A04(audioTrack, byteBuffer, i);
        if (A04 < 0) {
            this.A02 = 0;
            return A04;
        }
        int i6 = this.A02 - A04;
        String[] strArr = A0z;
        if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
            throw new RuntimeException();
        }
        A0z[7] = "dZEIQVBMkpJ01dOsE3P3AYpi9pP3UgAn";
        this.A02 = i6;
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A06() {
        if (this.A0K.A04 == 0) {
            long j6 = this.A0A;
            if (A0z[1].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A0z;
            strArr[2] = "fKroUyDCoriQZ27MdWvBeynNHxXh31S0";
            strArr[6] = "V2Tsqcz9Ivj1DWTn2T33JaE9HhmQCs1A";
            return j6 / this.A0K.A01;
        }
        return this.A09;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A07() {
        if (this.A0K.A04 == 0) {
            return this.A0C / this.A0K.A05;
        }
        return this.A0B;
    }

    private long A08(long j6) {
        while (!this.A0q.isEmpty() && j6 >= this.A0q.getFirst().A00) {
            C9J remove = this.A0q.remove();
            String[] strArr = A0z;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A0z[7] = "uS5QwbhdMNBXkjn1i9eeeV7Jy2FKd79B";
            this.A0N = remove;
        }
        long j9 = j6 - this.A0N.A00;
        if (this.A0N.A02.equals(C2379px.A06)) {
            return this.A0N.A01 + j9;
        }
        if (this.A0q.isEmpty()) {
            long mediaDurationSinceLastCheckpointUs = this.A0g.A8U(j9);
            long playoutDurationSinceLastCheckpointUs = this.A0N.A01;
            return playoutDurationSinceLastCheckpointUs + mediaDurationSinceLastCheckpointUs;
        }
        C9J first = this.A0q.getFirst();
        long A0Q = C5C.A0Q(first.A00 - j6, this.A0N.A02.A01);
        long playoutDurationSinceLastCheckpointUs2 = first.A01;
        return playoutDurationSinceLastCheckpointUs2 - A0Q;
    }

    private long A09(long j6) {
        return this.A0K.A08(this.A0g.A98()) + j6;
    }

    public static AudioFormat A0D(int i, int i6, int i9) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i6).setEncoding(i9).build();
    }

    private AudioTrack A0F() throws C07478t {
        try {
            return A0G((C9H) AbstractC06243y.A01(this.A0K));
        } catch (C07478t e9) {
            int retryBufferSize = A00();
            if (this.A0K.A00 > retryBufferSize) {
                C9H A0C = this.A0K.A0C(retryBufferSize);
                try {
                    AudioTrack A0G = A0G(A0C);
                    this.A0K = A0C;
                    return A0G;
                } catch (C07478t initialFailure) {
                    e9.addSuppressed(initialFailure);
                    A0O();
                    throw e9;
                }
            }
            A0O();
            throw e9;
        }
    }

    private AudioTrack A0G(C9H c9h) throws C07478t {
        try {
            AudioTrack A0A = c9h.A0A(this.A0b, this.A0E, this.A01);
            if (0 != 0) {
                A0l(A0A);
            }
            return A0A;
        } catch (C07478t e9) {
            if (this.A0I != null) {
                this.A0I.AD6(e9);
            }
            throw e9;
        }
    }

    private C2379px A0I() {
        return A0K().A02;
    }

    private C9J A0K() {
        if (this.A0M != null) {
            return this.A0M;
        }
        if (!this.A0q.isEmpty()) {
            return this.A0q.getLast();
        }
        return this.A0N;
    }

    public static /* synthetic */ AtomicInteger A0M() {
        AtomicInteger atomicInteger = A11;
        if (A0z[4].length() == 6) {
            throw new RuntimeException();
        }
        A0z[7] = "bxvwh9PGR3JBxYGaTMYcQ8NcsphLXH3B";
        return atomicInteger;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0N() {
        for (int i = 0; i < i; i++) {
            InterfaceC06103k interfaceC06103k = this.A0d[i];
            interfaceC06103k.flush();
            this.A0e[i] = interfaceC06103k.A8d();
        }
    }

    private void A0O() {
        if (this.A0K.A0D()) {
            if (A0z[1].length() != 2) {
                throw new RuntimeException();
            }
            A0z[5] = "ac1bNzRzCepoXog5xkGE2UP5sVZPG6ZN";
            this.A0W = true;
        }
    }

    private void A0P() {
        if (!this.A0a) {
            this.A0a = true;
            this.A0k.A0H(A07());
            this.A0D.stop();
            this.A02 = 0;
        }
    }

    private void A0Q() {
        this.A0A = 0L;
        this.A09 = 0L;
        this.A0C = 0L;
        this.A0B = 0L;
        this.A0V = false;
        this.A04 = 0;
        this.A0N = new C9J(A0I(), A0p(), 0L, 0L);
        this.A08 = 0L;
        this.A0M = null;
        this.A0q.clear();
        this.A0Q = null;
        this.A05 = 0;
        this.A0R = null;
        this.A0a = false;
        this.A0U = false;
        this.A03 = -1;
        this.A0P = null;
        this.A02 = 0;
        this.A0p.A0D();
        A0N();
    }

    private void A0R() {
        if (!A0h()) {
            return;
        }
        if (C5C.A02 >= 21) {
            A0X(this.A0D, this.A00);
        } else {
            A0Y(this.A0D, this.A00);
        }
    }

    private void A0S() {
        InterfaceC06103k[] interfaceC06103kArr = this.A0K.A09;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC06103k interfaceC06103k : interfaceC06103kArr) {
            if (interfaceC06103k.AAL()) {
                arrayList.add(interfaceC06103k);
            } else {
                interfaceC06103k.flush();
            }
        }
        int size = arrayList.size();
        InterfaceC06103k[] audioProcessors = new InterfaceC06103k[size];
        this.A0d = (InterfaceC06103k[]) arrayList.toArray(audioProcessors);
        this.A0e = new ByteBuffer[size];
        A0N();
    }

    private void A0U(long j6) {
        C2379px c2379px;
        boolean z3;
        if (A0i()) {
            c2379px = this.A0g.A4F(A0I());
        } else {
            c2379px = C2379px.A06;
            if (A0z[7].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A0z;
            strArr[0] = "I2oaxDVd9h4oXXSjJqrHfFArwnmkYbuU";
            strArr[3] = "djNSsSrQ9W3py9jFqud3MNGsNXIKPv6H";
        }
        if (A0i()) {
            z3 = this.A0g.A4G(A0p());
        } else {
            z3 = false;
        }
        this.A0q.add(new C9J(c2379px, z3, Math.max(0L, j6), this.A0K.A08(A07())));
        A0S();
        if (this.A0I != null) {
            this.A0I.AFy(z3);
        }
    }

    private void A0V(long j6) throws C07508y {
        ByteBuffer byteBuffer;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                ByteBuffer[] byteBufferArr = this.A0e;
                int i6 = i - 1;
                String[] strArr = A0z;
                String str = strArr[0];
                String str2 = strArr[3];
                int index = str.charAt(31);
                int count = str2.charAt(31);
                if (index == count) {
                    throw new RuntimeException();
                }
                A0z[1] = "0P";
                byteBuffer = byteBufferArr[i6];
            } else {
                byteBuffer = this.A0Q != null ? this.A0Q : InterfaceC06103k.A00;
            }
            if (i == length) {
                A0e(byteBuffer, j6);
            } else {
                InterfaceC06103k interfaceC06103k = this.A0d[i];
                int index2 = this.A03;
                if (i > index2) {
                    interfaceC06103k.AHH(byteBuffer);
                }
                ByteBuffer A8d = interfaceC06103k.A8d();
                this.A0e[i] = A8d;
                if (A8d.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private void A0W(AudioTrack audioTrack) {
        if (this.A0O == null) {
            this.A0O = new C9P(this);
        }
        C9P c9p = this.A0O;
        String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        A0z[7] = "8t8nFWsxRl9HTQxqXeO3m9pm7diLrI9Q";
        c9p.A00(audioTrack);
    }

    public static void A0X(AudioTrack audioTrack, float f3) {
        audioTrack.setVolume(f3);
    }

    public static void A0Y(AudioTrack audioTrack, float f3) {
        audioTrack.setStereoVolume(f3, f3);
    }

    private void A0Z(final AudioTrack audioTrack, final AnonymousClass48 anonymousClass48, final InterfaceC07488v interfaceC07488v, final C07458r c07458r) {
        anonymousClass48.A02();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (A10) {
            if (A0x == null) {
                A0x = C5C.A0u(A0L(23, 33, 21));
            }
            A0w++;
            A0x.execute(new Runnable() { // from class: com.facebook.ads.redexgen.X.9A
                @Override // java.lang.Runnable
                public final void run() {
                    C2281oM.A0a(audioTrack, interfaceC07488v, handler, c07458r, anonymousClass48);
                }
            });
        }
    }

    public static /* synthetic */ void A0a(AudioTrack audioTrack, final InterfaceC07488v interfaceC07488v, Handler handler, final C07458r c07458r, AnonymousClass48 anonymousClass48) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC07488v != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.99
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC07488v.this.AD8(c07458r);
                    }
                });
            }
            anonymousClass48.A04();
            synchronized (A10) {
                A0w--;
                if (A0w == 0) {
                    A0x.shutdown();
                    A0x = null;
                }
            }
        } catch (Throwable th) {
            if (interfaceC07488v != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.99
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC07488v.this.AD8(c07458r);
                    }
                });
            }
            anonymousClass48.A04();
            synchronized (A10) {
                A0w--;
                if (A0w == 0) {
                    A0x.shutdown();
                    A0x = null;
                }
                throw th;
            }
        }
    }

    private void A0b(C2379px c2379px) {
        if (A0h()) {
            try {
                this.A0D.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c2379px.A01).setPitch(c2379px.A00).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e9) {
                AbstractC06324g.A0A(A0L(7, 16, 23), A0L(56, 29, 89), e9);
            }
            PlaybackParams playbackParams = this.A0D.getPlaybackParams();
            float speed = playbackParams.getSpeed();
            PlaybackParams playbackParams2 = this.A0D.getPlaybackParams();
            c2379px = new C2379px(speed, playbackParams2.getPitch());
            this.A0k.A0G(c2379px.A01);
        }
        this.A0G = c2379px;
    }

    private void A0c(C2379px c2379px, boolean z3) {
        C9J A0K = A0K();
        if (!c2379px.equals(A0K.A02) || z3 != A0K.A03) {
            C9J mediaPositionParameters = new C9J(c2379px, z3, b.f6382b, b.f6382b);
            if (A0h()) {
                this.A0M = mediaPositionParameters;
            } else {
                this.A0N = mediaPositionParameters;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e8, code lost:
    
        if (r0 < r2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0e(ByteBuffer byteBuffer, long j6) throws C07508y {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        if (this.A0R != null) {
            AbstractC06243y.A07(this.A0R == byteBuffer);
        } else {
            this.A0R = byteBuffer;
            if (C5C.A02 < 21) {
                int remaining = byteBuffer.remaining();
                if (this.A0c != null) {
                    int bytesRemaining = this.A0c.length;
                }
                this.A0c = new byte[remaining];
                int error = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, remaining);
                byteBuffer.position(error);
                this.A06 = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        String[] strArr = A0z;
        if (strArr[0].charAt(31) != strArr[3].charAt(31)) {
            String[] strArr2 = A0z;
            strArr2[0] = "3eWYirSbyPmDL1bYCzZXBxfzFZ0IdKrC";
            strArr2[3] = "GyxGkXW2OhP0jBJSoZP6T4LL67dzWnKX";
            int i = 0;
            if (C5C.A02 < 21) {
                int A0C = this.A0k.A0C(this.A0C);
                if (A0C > 0) {
                    i = this.A0D.write(this.A0c, this.A06, Math.min(remaining2, A0C));
                    if (i > 0) {
                        this.A06 += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else {
                boolean z3 = this.A0b;
                int error2 = A0z[5].charAt(7);
                if (error2 != 67) {
                    A0z[7] = "ZkKj9ZygtLpdvIDMWffq04xWvvg8fJzl";
                    if (!z3) {
                        i = A04(this.A0D, byteBuffer, remaining2);
                    } else {
                        AbstractC06243y.A08(j6 != b.f6382b);
                        i = A05(this.A0D, byteBuffer, remaining2, j6);
                    }
                }
            }
            this.A07 = SystemClock.elapsedRealtime();
            if (i < 0) {
                C07508y c07508y = new C07508y(i, this.A0K.A07, A0k(i) && this.A0B > 0);
                if (this.A0I != null) {
                    this.A0I.AD6(c07508y);
                }
                if (!c07508y.A02) {
                    this.A0o.A01(c07508y);
                    return;
                }
                throw c07508y;
            }
            this.A0o.A00();
            if (A0l(this.A0D)) {
                if (this.A0B > 0) {
                    this.A0V = false;
                }
                if (this.A0X && this.A0I != null && i < remaining2 && !this.A0V) {
                    this.A0I.AF3();
                }
            }
            int bytesRemaining2 = this.A0K.A04;
            if (bytesRemaining2 == 0) {
                this.A0C += i;
            }
            if (i == remaining2) {
                int bytesRemaining3 = this.A0K.A04;
                if (bytesRemaining3 != 0) {
                    AbstractC06243y.A08(byteBuffer == this.A0Q);
                    long j9 = this.A0B;
                    int bytesRemaining4 = this.A04;
                    long j10 = bytesRemaining4;
                    int bytesRemaining5 = this.A05;
                    this.A0B = j9 + (j10 * bytesRemaining5);
                }
                this.A0R = null;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r8.A0R != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r8.A0R != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0f() throws C07508y {
        boolean z3 = false;
        if (this.A03 == -1) {
            this.A03 = 0;
            z3 = true;
        }
        while (this.A03 < this.A0d.length) {
            InterfaceC06103k interfaceC06103k = this.A0d[this.A03];
            if (z3) {
                interfaceC06103k.AHG();
            }
            A0V(b.f6382b);
            boolean AAP = interfaceC06103k.AAP();
            String[] strArr = A0z;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0z;
            strArr2[0] = "SZlzkFrjT9RrDQln4ds2mG9At4QQTsjU";
            strArr2[3] = "7YjBVNvSPjH845plY2W9SI0PPB4m8Pgz";
            if (!AAP) {
                return false;
            }
            z3 = true;
            this.A03++;
        }
        if (this.A0R != null) {
            A0e(this.A0R, b.f6382b);
            String[] strArr3 = A0z;
            if (strArr3[2].charAt(24) == strArr3[6].charAt(24)) {
                A0z[1] = "ih";
            }
        }
        this.A03 = -1;
        return true;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes; Upstream has this feature")
    private boolean A0g() throws C07478t {
        if (!this.A0h.A03()) {
            return false;
        }
        this.A0D = this.A0S ? A0F() : A0G(this.A0K);
        String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0z;
        strArr2[2] = "dWhjJD4ryPYmrGCHimoCOlqhHDAwt6Vc";
        strArr2[6] = "fifoJCnFOIc3PbrGHGLYECSFH4AKcCFA";
        if (A0l(this.A0D)) {
            A0W(this.A0D);
            if (this.A0f != 3) {
                this.A0D.setOffloadDelayPadding(this.A0K.A07.A08, this.A0K.A07.A09);
            }
        }
        if (C5C.A02 >= 31 && this.A0H != null) {
            C9D.A00(this.A0D, this.A0H);
        }
        this.A01 = this.A0D.getAudioSessionId();
        this.A0k.A0I(this.A0D, this.A0K.A04 == 2, this.A0K.A03, this.A0K.A05, this.A0K.A00);
        A0R();
        if (this.A0F.A01 != 0) {
            this.A0D.attachAuxEffect(this.A0F.A01);
            AudioTrack audioTrack = this.A0D;
            AnonymousClass21 anonymousClass21 = this.A0F;
            if (A0z[7].length() != 32) {
                audioTrack.setAuxEffectSendLevel(anonymousClass21.A00);
            } else {
                A0z[7] = "RIRRfrrRSIs4t73WNQ17weV6jTByi7uZ";
                audioTrack.setAuxEffectSendLevel(anonymousClass21.A00);
            }
        }
        if (this.A0J != null && C5C.A02 >= 23) {
            C9C.A00(this.A0D, this.A0J);
        }
        this.A0Y = true;
        if (this.A0I != null) {
            this.A0I.AD7(this.A0K.A0B());
        }
        return true;
    }

    private boolean A0h() {
        return this.A0D != null;
    }

    private boolean A0i() {
        if (!this.A0b) {
            if (A0L(271, 9, 70).equals(this.A0K.A07.A0W) && !A0j(this.A0K.A07.A0C)) {
                return true;
            }
        }
        return false;
    }

    private boolean A0j(int i) {
        return this.A0s && C5C.A14(i);
    }

    public static boolean A0k(int i) {
        return (C5C.A02 >= 24 && i == -6) || i == -32;
    }

    public static boolean A0l(AudioTrack audioTrack) {
        return C5C.A02 >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0m(C2400qI c2400qI, C2406qQ c2406qQ) {
        int A03;
        int channelConfig;
        if (C5C.A02 < 29 || this.A0f == 0 || (A03 = C3J.A03((String) AbstractC06243y.A01(c2400qI.A0W), c2400qI.A0R)) == 0) {
            return false;
        }
        int encoding = c2400qI.A06;
        int channelConfig2 = C5C.A01(encoding);
        if (channelConfig2 == 0) {
            return false;
        }
        int encoding2 = c2400qI.A0G;
        switch (A03(A0D(encoding2, channelConfig2, A03), c2406qQ.A01().A00)) {
            case 0:
                return false;
            case 1:
                int encoding3 = c2400qI.A08;
                if (encoding3 == 0) {
                    int encoding4 = c2400qI.A09;
                    if (encoding4 == 0) {
                        channelConfig = 0;
                        int encoding5 = this.A0f;
                        int encoding6 = encoding5 != 1 ? 1 : 0;
                        return channelConfig != 0 || encoding6 == 0;
                    }
                }
                channelConfig = 1;
                int encoding52 = this.A0f;
                if (encoding52 != 1) {
                }
                if (channelConfig != 0) {
                }
            case 2:
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A0o(C2400qI c2400qI) {
        if (!A0L(271, 9, 70).equals(c2400qI.A0W)) {
            return ((this.A0W || !A0m(c2400qI, this.A0E)) && !this.A0j.A0B(c2400qI)) ? 0 : 2;
        }
        if (!C5C.A15(c2400qI.A0C)) {
            AbstractC06324g.A07(A0L(7, 16, 23), A0L(85, 22, 8) + c2400qI.A0C);
            return 0;
        }
        int i = c2400qI.A0C;
        if (A0z[7].length() != 32) {
            throw new RuntimeException();
        }
        A0z[1] = "pL";
        return (i == 2 || (this.A0s && c2400qI.A0C == 4)) ? 2 : 1;
    }

    public final boolean A0p() {
        return A0K().A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void A59(C2400qI c2400qI, int i, int[] iArr) throws C07468s {
        int outputSampleRate;
        InterfaceC06103k[] interfaceC06103kArr;
        int outputSampleRate2;
        int outputPcmFrameSize;
        int outputChannelConfig;
        int intValue;
        int outputEncoding;
        int outputMode = i;
        int[] iArr2 = iArr;
        if (A0L(271, 9, 70).equals(c2400qI.A0W)) {
            AbstractC06243y.A07(C5C.A15(c2400qI.A0C));
            outputSampleRate = C5C.A06(c2400qI.A0C, c2400qI.A06);
            if (A0j(c2400qI.A0C)) {
                interfaceC06103kArr = this.A0t;
            } else {
                interfaceC06103kArr = this.A0u;
            }
            C9x c9x = this.A0p;
            int inputPcmFrameSize = c2400qI.A08;
            c9x.A0E(inputPcmFrameSize, c2400qI.A09);
            int inputPcmFrameSize2 = C5C.A02;
            if (inputPcmFrameSize2 < 21) {
                int inputPcmFrameSize3 = c2400qI.A06;
                if (inputPcmFrameSize3 == 8 && iArr2 == null) {
                    iArr2 = new int[6];
                    for (int inputPcmFrameSize4 = 0; inputPcmFrameSize4 < iArr2.length; inputPcmFrameSize4++) {
                        iArr2[inputPcmFrameSize4] = inputPcmFrameSize4;
                    }
                }
            }
            this.A0l.A0C(iArr2);
            int i6 = c2400qI.A0G;
            int inputPcmFrameSize5 = c2400qI.A06;
            C06083i c06083i = new C06083i(i6, inputPcmFrameSize5, c2400qI.A0C);
            for (InterfaceC06103k interfaceC06103k : interfaceC06103kArr) {
                try {
                    C06083i A57 = interfaceC06103k.A57(c06083i);
                    if (interfaceC06103k.AAL()) {
                        c06083i = A57;
                    }
                } catch (C06093j e9) {
                    throw new C07468s(e9, c2400qI);
                }
            }
            outputChannelConfig = 0;
            intValue = c06083i.A02;
            outputSampleRate2 = c06083i.A03;
            outputEncoding = C5C.A01(c06083i.A01);
            outputPcmFrameSize = C5C.A06(intValue, c06083i.A01);
        } else {
            outputSampleRate = -1;
            interfaceC06103kArr = new InterfaceC06103k[0];
            outputSampleRate2 = c2400qI.A0G;
            outputPcmFrameSize = -1;
            if (A0m(c2400qI, this.A0E)) {
                outputChannelConfig = 1;
                intValue = C3J.A03((String) AbstractC06243y.A01(c2400qI.A0W), c2400qI.A0R);
                outputEncoding = C5C.A01(c2400qI.A06);
            } else {
                outputChannelConfig = 2;
                if (A0z[1].length() == 2) {
                    A0z[5] = "lAbqtU1Up8pAGeHbeXVy9OX5EzAUCGx9";
                    Pair<Integer, Integer> A09 = this.A0j.A09(c2400qI);
                    if (A09 != null) {
                        intValue = ((Integer) A09.first).intValue();
                        outputEncoding = ((Integer) A09.second).intValue();
                        if (A0z[7].length() == 32) {
                            A0z[1] = "Lw";
                        }
                    } else {
                        throw new C07468s(A0L(BaseATView.a.f9770F, 37, 24) + c2400qI, c2400qI);
                    }
                }
                throw new RuntimeException();
            }
        }
        String A0L = A0L(0, 7, 114);
        if (intValue != 0) {
            if (outputEncoding != 0) {
                if (outputMode == 0) {
                    C9F c9f = this.A0m;
                    int A01 = A01(outputSampleRate2, outputEncoding, intValue);
                    int outputChannelConfig2 = outputPcmFrameSize != -1 ? outputPcmFrameSize : 1;
                    outputMode = c9f.A75(A01, intValue, outputChannelConfig, outputChannelConfig2, outputSampleRate2, c2400qI.A05, this.A0r ? 8.0d : 1.0d);
                }
                this.A0W = false;
                C9H c9h = new C9H(c2400qI, outputSampleRate, outputChannelConfig, outputPcmFrameSize, outputSampleRate2, outputEncoding, intValue, outputMode, interfaceC06103kArr, this.A0b);
                if (A0h()) {
                    this.A0L = c9h;
                    return;
                } else {
                    this.A0K = c9h;
                    return;
                }
            }
            throw new C07468s(A0L(107, 36, 56) + outputChannelConfig + A0L + c2400qI, c2400qI);
        }
        throw new C07468s(A0L(143, 30, 72) + outputChannelConfig + A0L + c2400qI, c2400qI);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void A5z() {
        if (this.A0b) {
            this.A0b = false;
            flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void A6M() {
        AbstractC06243y.A08(C5C.A02 >= 21);
        AbstractC06243y.A08(this.A0T);
        if (!this.A0b) {
            this.A0b = true;
            flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void A6T() {
        if (C5C.A02 < 25) {
            flush();
            return;
        }
        this.A0o.A00();
        this.A0n.A00();
        if (!A0h()) {
            return;
        }
        A0Q();
        if (this.A0k.A0J()) {
            this.A0D.pause();
        }
        this.A0D.flush();
        this.A0k.A0E();
        this.A0k.A0I(this.A0D, this.A0K.A04 == 2, this.A0K.A03, this.A0K.A05, this.A0K.A00);
        this.A0Y = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final long A7f(boolean z3) {
        if (!A0h() || this.A0Y) {
            return Long.MIN_VALUE;
        }
        long A0D = this.A0k.A0D(z3);
        C9H c9h = this.A0K;
        long positionUs = A07();
        return A09(A08(Math.min(A0D, c9h.A08(positionUs))));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final C2379px A8m() {
        if (this.A0r) {
            return this.A0G;
        }
        return A0I();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final boolean A9e(ByteBuffer byteBuffer, final long adjustmentUs, int i) throws C07478t, C07508y {
        AbstractC06243y.A07(this.A0Q == null || byteBuffer == this.A0Q);
        if (this.A0L != null) {
            if (!A0f()) {
                return false;
            }
            if (this.A0L.A0E(this.A0K)) {
                this.A0K = this.A0L;
                this.A0L = null;
                if (A0l(this.A0D) && this.A0f != 3) {
                    if (this.A0D.getPlayState() == 3) {
                        this.A0D.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.A0D;
                    int i6 = this.A0K.A07.A08;
                    String[] strArr = A0z;
                    if (strArr[0].charAt(31) != strArr[3].charAt(31)) {
                        String[] strArr2 = A0z;
                        strArr2[0] = "jzTmuhmcT6oYK5lhq8C6QOSyUXF7wdwQ";
                        strArr2[3] = "cWMrj79Gd0zdSeVIzQJ8siz7G3nSjdgD";
                        audioTrack.setOffloadDelayPadding(i6, this.A0K.A07.A09);
                        this.A0V = true;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                A0P();
                if (A9o()) {
                    return false;
                }
                flush();
            }
            A0U(adjustmentUs);
        }
        if (!A0h()) {
            try {
                if (!A0g()) {
                    return false;
                }
            } catch (C07478t e9) {
                if (!e9.A02) {
                    this.A0n.A01(e9);
                    return false;
                }
                throw e9;
            }
        }
        this.A0n.A00();
        if (this.A0Y) {
            this.A08 = Math.max(0L, adjustmentUs);
            this.A0Z = false;
            this.A0Y = false;
            if (this.A0r && C5C.A02 >= 23) {
                A0b(this.A0G);
            }
            A0U(adjustmentUs);
            if (this.A0X) {
                AH0();
            }
        }
        if (!this.A0k.A0N(A07())) {
            return false;
        }
        if (this.A0Q == null) {
            AbstractC06243y.A07(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.A0K.A04 != 0 && this.A04 == 0) {
                this.A04 = A02(this.A0K.A03, byteBuffer);
                if (this.A04 == 0) {
                    return true;
                }
            }
            if (this.A0M != null) {
                if (!A0f()) {
                    return false;
                }
                A0U(adjustmentUs);
                this.A0M = null;
            }
            final long A09 = this.A08 + this.A0K.A09(A06() - this.A0p.A0C());
            if (!this.A0Z && Math.abs(A09 - adjustmentUs) > 200000) {
                if (this.A0I != null) {
                    this.A0I.AD6(new Exception(adjustmentUs, A09) { // from class: com.facebook.ads.redexgen.X.8x
                        public static byte[] A02;
                        public final long A00;
                        public final long A01;

                        static {
                            A01();
                        }

                        public static String A00(int i9, int i10, int i11) {
                            byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
                            for (int i12 = 0; i12 < copyOfRange.length; i12++) {
                                copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 106);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{-20, -32, 39, 47, 52, -32, 29, 54, 45, c.f16317b, 56, 45, 43, 60, 45, 44, -24, 41, 61, 44, 49, 55, -24, 60, 58, 41, 43, 51, -24, 60, 49, 53, 45, 59, 60, 41, 53, 56, -24, 44, 49, 59, 43, 55, 54, 60, 49, 54, 61, 49, 60, 65, 2, -24, 45, c.f16317b, 56, 45, 43, 60, 45, 44, -24};
                        }

                        {
                            super(A00(6, 57, 94) + A09 + A00(0, 6, 86) + adjustmentUs);
                            this.A00 = adjustmentUs;
                            this.A01 = A09;
                        }
                    });
                }
                this.A0Z = true;
            }
            if (this.A0Z) {
                if (!A0f()) {
                    return false;
                }
                long j6 = adjustmentUs - A09;
                this.A08 += j6;
                this.A0Z = false;
                A0U(adjustmentUs);
                if (this.A0I != null && j6 != 0) {
                    this.A0I.AFO();
                }
            }
            if (this.A0K.A04 == 0) {
                this.A0A += byteBuffer.remaining();
            } else {
                this.A09 += this.A04 * i;
            }
            this.A0Q = byteBuffer;
            this.A05 = i;
        }
        A0V(adjustmentUs);
        if (!this.A0Q.hasRemaining()) {
            this.A0Q = null;
            this.A05 = 0;
            return true;
        }
        if (this.A0k.A0M(A07())) {
            AbstractC06324g.A07(A0L(7, 16, 23), A0L(178, 29, 2));
            flush();
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void A9h() {
        this.A0Z = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final boolean A9o() {
        return A0h() && this.A0k.A0L(A07());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final boolean AAP() {
        return !A0h() || (this.A0U && !A9o());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AH0() {
        this.A0X = true;
        if (A0h()) {
            this.A0k.A0F();
            this.A0D.play();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AH2() throws C07508y {
        if (!this.A0U && A0h() && A0f()) {
            A0P();
            this.A0U = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJG(C2406qQ c2406qQ) {
        if (this.A0E.equals(c2406qQ)) {
            return;
        }
        this.A0E = c2406qQ;
        if (this.A0b) {
            return;
        }
        flush();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJH(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            this.A0T = i != 0;
            flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJI(AnonymousClass21 anonymousClass21) {
        if (this.A0F.equals(anonymousClass21)) {
            return;
        }
        int i = anonymousClass21.A01;
        float f3 = anonymousClass21.A00;
        if (this.A0D != null) {
            int effectId = this.A0F.A01;
            if (effectId != i) {
                AudioTrack audioTrack = this.A0D;
                if (A0z[7].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A0z;
                strArr[0] = "ejzMDVkCKjmiTtIYDMlHFxA2dL6L7Th4";
                strArr[3] = "3op87oKeQBz5MvPCbX5N1e1cWqib6LOP";
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.A0D.setAuxEffectSendLevel(f3);
            }
        }
        this.A0F = anonymousClass21;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes")
    public final void AJQ(boolean z3) {
        this.A0S = z3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJV(InterfaceC07488v interfaceC07488v) {
        this.A0I = interfaceC07488v;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJd(C2379px c2379px) {
        C2379px c2379px2 = new C2379px(C5C.A00(c2379px.A01, 0.1f, 8.0f), C5C.A00(c2379px.A00, 0.1f, 8.0f));
        if (this.A0r) {
            int i = C5C.A02;
            String[] strArr = A0z;
            if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0z;
            strArr2[0] = "mNkMATimN2JlCwGmoqKrFKrIOPJhoNaC";
            strArr2[3] = "5L3Fdp27ixuu2nNAlcGmWXwucnCjA2b5";
            if (i >= 23) {
                A0b(c2379px2);
                return;
            }
        }
        A0c(c2379px2, A0p());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJg(C8O c8o) {
        this.A0H = c8o;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJi(AudioDeviceInfo audioDeviceInfo) {
        this.A0J = audioDeviceInfo == null ? null : new C9E(audioDeviceInfo);
        String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0z;
        strArr2[0] = "fdceU7wc4F7eltehFDuXboaWNHZsjBbo";
        strArr2[3] = "ndF9ePFUZlaV1XmuWN8y5PTJytJgMa2t";
        if (this.A0D != null) {
            C9C.A00(this.A0D, this.A0J);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void AJo(boolean z3) {
        A0c(A0I(), z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final boolean AKN(C2400qI c2400qI) {
        return A0o(c2400qI) != 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    public final boolean AKP(int i, int i6) {
        return C5C.A15(i6) ? i6 != 4 || C5C.A02 >= 21 : this.A0j != null && this.A0j.A0A(i6) && (i == -1 || i <= this.A0j.A08());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void flush() {
        if (A0h()) {
            A0Q();
            if (this.A0k.A0J()) {
                this.A0D.pause();
            }
            boolean A0l = A0l(this.A0D);
            if (A0z[4].length() == 6) {
                throw new RuntimeException();
            }
            A0z[5] = "i9Rinuw5ztOihCbMK36CN4CjOXT3DfRT";
            if (A0l) {
                C9P c9p = this.A0O;
                if (A0z[7].length() != 32) {
                    throw new RuntimeException();
                }
                A0z[7] = "H3Tn5qbfAuT8Q6Ln8VWJEFxZf5lTeqqt";
                ((C9P) AbstractC06243y.A01(c9p)).A01(this.A0D);
            }
            if (C5C.A02 < 21 && !this.A0T) {
                this.A01 = 0;
            }
            C07458r A0B = this.A0K.A0B();
            if (this.A0L != null) {
                this.A0K = this.A0L;
                this.A0L = null;
            }
            this.A0k.A0E();
            A0Z(this.A0D, this.A0h, this.A0I, A0B);
            this.A0D = null;
        }
        this.A0o.A00();
        this.A0n.A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void pause() {
        this.A0X = false;
        if (A0h() && this.A0k.A0K()) {
            this.A0D.pause();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07518z
    public final void setVolume(float f3) {
        if (this.A00 != f3) {
            this.A00 = f3;
            String[] strArr = A0z;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A0z[5] = "E1Te023wTVVNappUuQixsG3bphOCE2I8";
            A0R();
        }
    }
}
