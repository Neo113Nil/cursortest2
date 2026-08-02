package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Lo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2684Lo extends AbstractBinderC3359i8 implements InterfaceC2536Dc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26968n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f26969u;

    public BinderC2684Lo() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2536Dc
    public final void C1(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f26968n) {
            case 0:
                ((C2718No) this.f26969u).b(list);
                return;
            default:
                s2.J0 j02 = (s2.J0) this.f26969u;
                synchronized (j02.f40356d) {
                    j02.f40358f = false;
                    j02.f40359g = true;
                    arrayList = new ArrayList(j02.f40357e);
                    j02.f40357e.clear();
                }
                s2.J0.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((com.IceFishing.LiveIceFishing.A) arrayList.get(i)).getClass();
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C4295zc.CREATOR);
        AbstractC3411j8.f(parcel);
        C1(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC2684Lo(C2718No c2718No) {
        this();
        this.f26968n = 0;
        Objects.requireNonNull(c2718No);
        this.f26969u = c2718No;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC2684Lo(s2.J0 j02) {
        this();
        this.f26968n = 1;
        Objects.requireNonNull(j02);
        this.f26969u = j02;
    }
}
