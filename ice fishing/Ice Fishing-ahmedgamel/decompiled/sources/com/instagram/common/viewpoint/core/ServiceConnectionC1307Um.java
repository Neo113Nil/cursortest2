package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ServiceConnectionC1307Um implements ServiceConnection {
    public static byte[] A01;
    public static String[] A02 = {"Vw4807oGxAdaHl5Al", "61OeIm55zagm9eF8TwwypJ2x", "EMmzBhTNP4w9g", "EYH0yzb9nIvkx5HKrwnVnQphst8", "oJpEUQYv6dauwAdzygMcXKep8asdjHHS", "ZEL", "ZTCWoVSxq9DuX", "VaiI"};
    public final /* synthetic */ C1308Un A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            byte b9 = (byte) ((copyOfRange[i9] - i6) - 13);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "dt08HEEvYnWJr";
            strArr[2] = "T3OITLjrwLx4m";
            copyOfRange[i9] = b9;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 116, -127, -123, 120, 114, 116, 47, 114, 126, 125, 125, 116, 114, -125, 116, 115, -66, -48, -35, -31, -44, -50, -48, -117, -49, -44, -34, -50, -38, -39, -39, -48, -50, -33, -48, -49};
    }

    static {
        A01();
    }

    public ServiceConnectionC1307Um(C1308Un c1308Un) {
        this.A00 = c1308Un;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Bundle A00;
        C1860gi c1860gi;
        Messenger messenger;
        this.A00.A08(AbstractC1272Td.A1r, new C1273Te(A00(0, 17, 2)));
        this.A00.A01 = true;
        this.A00.A00 = new Messenger(iBinder);
        Message obtain = Message.obtain((Handler) null, 1);
        A00 = this.A00.A00();
        obtain.setData(A00);
        try {
            messenger = this.A00.A00;
            messenger.send(obtain);
        } catch (RemoteException e9) {
            this.A00.A07(AbstractC1272Td.A1q, new C1273Te(e9));
        }
        c1860gi = this.A00.A03;
        c1860gi.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1860gi c1860gi;
        this.A00.A08(AbstractC1272Td.A1s, new C1273Te(A00(17, 20, 94)));
        try {
            c1860gi = this.A00.A03;
            c1860gi.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.A00.A00 = null;
        this.A00.A01 = false;
    }
}
