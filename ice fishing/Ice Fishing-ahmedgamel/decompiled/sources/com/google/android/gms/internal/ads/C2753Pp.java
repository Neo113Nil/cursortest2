package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2753Pp extends B1.b {

    /* renamed from: B, reason: collision with root package name */
    public static final SparseArray f27653B;

    /* renamed from: A, reason: collision with root package name */
    public int f27654A;

    /* renamed from: w, reason: collision with root package name */
    public final Context f27655w;

    /* renamed from: x, reason: collision with root package name */
    public final G3.j f27656x;

    /* renamed from: y, reason: collision with root package name */
    public final TelephonyManager f27657y;

    /* renamed from: z, reason: collision with root package name */
    public final C2719Np f27658z;

    static {
        SparseArray sparseArray = new SparseArray();
        f27653B = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC3628n9.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC3628n9 enumC3628n9 = EnumC3628n9.CONNECTING;
        sparseArray.put(ordinal, enumC3628n9);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC3628n9);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC3628n9);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC3628n9.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC3628n9 enumC3628n92 = EnumC3628n9.DISCONNECTED;
        sparseArray.put(ordinal2, enumC3628n92);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC3628n92);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC3628n92);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC3628n92);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC3628n92);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC3628n9.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC3628n9);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC3628n9);
    }

    public C2753Pp(Context context, G3.j jVar, C2719Np c2719Np, S0.e eVar, C5140B c5140b) {
        super(eVar, c5140b);
        this.f27655w = context;
        this.f27656x = jVar;
        this.f27658z = c2719Np;
        this.f27657y = (TelephonyManager) context.getSystemService("phone");
    }
}
