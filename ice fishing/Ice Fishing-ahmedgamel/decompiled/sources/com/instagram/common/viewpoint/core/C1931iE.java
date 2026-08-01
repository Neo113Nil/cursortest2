package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Parcelable;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1931iE {
    public static byte[] A03;
    public final C1129Of A00;
    public final InterfaceC1725er A01;
    public final List<C1930iD> A02;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C1931iE(List<AbstractC1127Od> list, Bundle bundle, InterfaceC1725er interfaceC1725er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1725er;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C1930iD(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C1129Of) AbstractC1362Xo.A00(bundle.getByteArray(A00(0, 10, a.f21727Q)));
    }

    public C1931iE(List<AbstractC1127Od> list, InterfaceC1725er interfaceC1725er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1725er;
        Iterator<AbstractC1127Od> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C1930iD(it.next()));
        }
        this.A00 = new C1129Of();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, a.f21727Q), AbstractC1362Xo.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C1930iD> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C1129Of A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C1930iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d2, double d9) {
        if (d9 >= 0.0d) {
            this.A00.A05(d2, d9);
        }
        double A9V = this.A01.A9V();
        this.A00.A04(d2, A9V);
        Iterator<C1930iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d2, A9V);
        }
    }
}
