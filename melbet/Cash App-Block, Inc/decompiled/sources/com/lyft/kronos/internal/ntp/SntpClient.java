package com.lyft.kronos.internal.ntp;

import android.os.SystemClock;
import com.fillr.e;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class SntpClient {
    public final e deviceClock;

    final class InvalidServerReplyException extends IOException {
    }

    public final class Response {
        public final long deviceCurrentTimestampMs;
        public final long deviceElapsedTimestampMs;
        public final long offsetMs;

        public Response(long j, long j2, long j3, e eVar) {
            this.deviceCurrentTimestampMs = j;
            this.deviceElapsedTimestampMs = j2;
            this.offsetMs = j3;
        }
    }

    public SntpClient(e eVar, DnsResolverImpl dnsResolverImpl, DnsResolverImpl dnsResolverImpl2) {
        this.deviceClock = eVar;
    }

    public static void checkValidServerReply(byte b, byte b2, int i, long j) {
        if (b == 3) {
            throw new InvalidServerReplyException("unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new InvalidServerReplyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b2, "untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new InvalidServerReplyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "untrusted stratum: "));
        }
        if (j == 0) {
            throw new InvalidServerReplyException("zero transmitTime");
        }
    }

    public static long read32(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long readTimeStamp(int i, byte[] bArr) {
        long read32 = read32(i, bArr);
        return ((read32(i + 4, bArr) * 1000) / 4294967296L) + ((read32 - 2208988800L) * 1000);
    }

    public final Response requestTime(Long l, String str) {
        DatagramSocket datagramSocket = null;
        try {
            str.getClass();
            InetAddress byName = InetAddress.getByName(str);
            byName.getClass();
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(l.intValue());
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                bArr[0] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = currentTimeMillis / 1000;
                long j2 = currentTimeMillis - (j * 1000);
                bArr[40] = (byte) (r12 >> 24);
                bArr[41] = (byte) (r12 >> 16);
                bArr[42] = (byte) (r12 >> 8);
                bArr[43] = (byte) (j + 2208988800L);
                long j3 = (j2 * 4294967296L) / 1000;
                bArr[44] = (byte) (j3 >> 24);
                bArr[45] = (byte) (j3 >> 16);
                bArr[46] = (byte) (j3 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
                datagramSocket2.send(datagramPacket);
                byte[] copyOf = Arrays.copyOf(bArr, 48);
                datagramSocket2.receive(new DatagramPacket(copyOf, copyOf.length));
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                byte b = copyOf[0];
                int i = copyOf[1] & 255;
                long readTimeStamp = readTimeStamp(24, copyOf);
                long readTimeStamp2 = readTimeStamp(32, copyOf);
                long readTimeStamp3 = readTimeStamp(40, copyOf);
                checkValidServerReply((byte) ((b >> 6) & 3), (byte) (b & 7), i, readTimeStamp3);
                Response response = new Response(j4, elapsedRealtime2, ((readTimeStamp3 - j4) + (readTimeStamp2 - readTimeStamp)) / 2, this.deviceClock);
                datagramSocket2.close();
                return response;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
