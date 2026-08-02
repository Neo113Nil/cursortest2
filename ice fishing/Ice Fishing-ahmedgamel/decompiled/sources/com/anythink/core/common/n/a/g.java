package com.anythink.core.common.n.a;

import com.anythink.core.common.n.a.d;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes.dex */
public class g extends d {
    public g(String str, int i, long j6) {
        super(str, i, j6);
    }

    @Override // com.anythink.core.common.n.a.d
    public final e a(d.a aVar, String str, String str2, int i) {
        b bVar = new b((short) (Math.random() * 65535.0d), i, str2);
        byte[] b9 = bVar.b();
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket = null;
        try {
            final DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                DatagramPacket datagramPacket = new DatagramPacket(b9, b9.length, byName, this.f15579b);
                try {
                    datagramSocket2.setSoTimeout((int) this.f15578a);
                } catch (Throwable unused) {
                    datagramSocket2.setSoTimeout(500);
                }
                aVar.f15582a.add(new Runnable() { // from class: com.anythink.core.common.n.a.g.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            datagramSocket2.disconnect();
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                        try {
                            datagramSocket2.close();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                datagramSocket2.send(datagramPacket);
                DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1500], 1500);
                datagramSocket2.receive(datagramPacket2);
                e eVar = new e(str, bVar, datagramPacket2.getData());
                datagramSocket2.close();
                return eVar;
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

    private g(String str, int i, long j6, int i4) {
        super(str, i, j6, i4);
    }
}
