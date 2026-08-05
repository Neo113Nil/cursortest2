package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ou implements Comparable {
    public final Bundle MdtA4re8;
    public final pu NCTxEWno;
    public final boolean P7K7Inc8;
    public final int VgvYg0wo;
    public final int b2ZJblxo;
    public final boolean wxUZMvaN;

    public ou(pu puVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.NCTxEWno = puVar;
        this.MdtA4re8 = bundle;
        this.wxUZMvaN = z;
        this.VgvYg0wo = i;
        this.P7K7Inc8 = z2;
        this.b2ZJblxo = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: qoPGr6Ce, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ou ouVar) {
        ouVar.getClass();
        boolean z = ouVar.P7K7Inc8;
        boolean z2 = ouVar.wxUZMvaN;
        Bundle bundle = ouVar.MdtA4re8;
        boolean z3 = this.wxUZMvaN;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.VgvYg0wo - ouVar.VgvYg0wo;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.MdtA4re8;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            bundle2.getClass();
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.P7K7Inc8;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.b2ZJblxo - ouVar.b2ZJblxo;
        }
        return -1;
    }
}
