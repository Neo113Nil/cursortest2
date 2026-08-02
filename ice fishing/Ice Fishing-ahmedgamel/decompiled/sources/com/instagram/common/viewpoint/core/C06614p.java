package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06614p {
    public static C06614p A04;
    public static byte[] A05;
    public static String[] A06 = {"7spJOR808jvRvy0GNSJxo7ZJ6", "86KvIandX8vj142355r0drGuD0jhaT0W", "mZfZ3s6", "1QsEKJVAx", "twpDIoiDpzCAIzfG", "B", "RSZaC18qSGa0csTWoF4Keu66v9ytRHBi", "eBKWjsIIuU1hX4JwQhfiQu0nhoXTyGkQ"};
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<InterfaceC06594n>> A03 = new CopyOnWriteArrayList<>();
    public final Object A02 = new Object();
    public int A00 = 0;

    public static String A04(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{89, 86, 92, 74, 87, 81, 92, 22, 86, 93, 76, 22, 91, 87, 86, 86, 22, 123, 119, 118, 118, 125, 123, 108, 113, 110, 113, 108, 97, 103, 123, 112, 121, 118, Byte.MAX_VALUE, 125, 99, 111, 110, 110, 101, 99, 116, 105, 118, 105, 116, 121};
    }

    static {
        A06();
    }

    public C06614p(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A04(0, 36, 40));
        context.registerReceiver(new C06604o(this), intentFilter);
    }

    public static int A00(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(A04(36, 12, 16));
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 1;
            }
            switch (networkInfo.getType()) {
                case 0:
                case 4:
                case 5:
                    return A02(networkInfo);
                case 1:
                    return 2;
                case 2:
                case 3:
                case 7:
                case 8:
                default:
                    return 8;
                case 6:
                    return 5;
                case 9:
                    return 7;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static int A02(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                if (A06[0].length() != 25) {
                    throw new RuntimeException();
                }
                A06[5] = "Xq0rs7E";
                return 2;
            case 20:
                return C5C.A02 >= 29 ? 9 : 0;
        }
    }

    public static synchronized C06614p A03(Context context) {
        C06614p c06614p;
        synchronized (C06614p.class) {
            if (A04 == null) {
                A04 = new C06614p(context);
            }
            c06614p = A04;
        }
        return c06614p;
    }

    private void A05() {
        Iterator<WeakReference<InterfaceC06594n>> it = this.A03.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC06594n> next = it.next();
            if (next.get() == null) {
                this.A03.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i) {
        synchronized (this.A02) {
            if (this.A00 == i) {
                return;
            }
            this.A00 = i;
            Iterator<WeakReference<InterfaceC06594n>> it = this.A03.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC06594n> next = it.next();
                InterfaceC06594n interfaceC06594n = next.get();
                if (interfaceC06594n != null) {
                    interfaceC06594n.AF1(i);
                } else {
                    this.A03.remove(next);
                }
            }
        }
    }

    public final int A09() {
        int i;
        synchronized (this.A02) {
            i = this.A00;
        }
        return i;
    }

    public final void A0A(final InterfaceC06594n interfaceC06594n) {
        A05();
        this.A03.add(new WeakReference<>(interfaceC06594n));
        this.A01.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.4j
            @Override // java.lang.Runnable
            public final void run() {
                C06614p.this.A0B(interfaceC06594n);
            }
        });
    }

    public final /* synthetic */ void A0B(InterfaceC06594n interfaceC06594n) {
        interfaceC06594n.AF1(A09());
    }
}
