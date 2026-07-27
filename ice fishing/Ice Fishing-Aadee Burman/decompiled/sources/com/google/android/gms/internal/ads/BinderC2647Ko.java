package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2647Ko extends AbstractBinderC3336i8 implements InterfaceC2516Dc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25971n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f25972u;

    public BinderC2647Ko() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2516Dc
    public final void H1(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f25971n) {
            case 0:
                ((C2681Mo) this.f25972u).b(list);
                return;
            default:
                q2.J0 j02 = (q2.J0) this.f25972u;
                synchronized (j02.f40054d) {
                    j02.f40056f = false;
                    j02.f40057g = true;
                    arrayList = new ArrayList(j02.f40055e);
                    j02.f40055e.clear();
                }
                q2.J0.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((com.icefishing.icefishinglive2.z) arrayList.get(i)).getClass();
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C4272zc.CREATOR);
        AbstractC3388j8.f(parcel);
        H1(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC2647Ko(C2681Mo c2681Mo) {
        this();
        this.f25971n = 0;
        Objects.requireNonNull(c2681Mo);
        this.f25972u = c2681Mo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC2647Ko(q2.J0 j02) {
        this();
        this.f25971n = 1;
        Objects.requireNonNull(j02);
        this.f25972u = j02;
    }
}
