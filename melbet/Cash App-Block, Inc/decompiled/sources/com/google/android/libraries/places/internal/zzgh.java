package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzgh implements Comparator {
    public static final /* synthetic */ zzgh zza = new zzgh();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}
