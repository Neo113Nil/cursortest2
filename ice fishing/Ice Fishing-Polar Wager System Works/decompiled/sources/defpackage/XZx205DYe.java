package defpackage;

/* loaded from: classes.dex */
public final class XZx205DYe extends defpackage.s21 {
    @Override // defpackage.s21
    public final boolean EgCjBq0SZwJ(defpackage.hyxIchWRW hyxichwrw, defpackage.yIx6ChFVk yix6chfvk) {
        defpackage.yIx6ChFVk yix6chfvk2 = defpackage.yIx6ChFVk.oh6vYeIP;
        synchronized (hyxichwrw) {
            try {
                if (hyxichwrw.xiZrDbcSW0 != yix6chfvk) {
                    return false;
                }
                hyxichwrw.xiZrDbcSW0 = yix6chfvk2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s21
    public final void EoOhNTTfIN7K(defpackage.mAr5m2L7gYDP mar5m2l7gydp, defpackage.mAr5m2L7gYDP mar5m2l7gydp2) {
        mar5m2l7gydp.oh6vYeIP = mar5m2l7gydp2;
    }

    @Override // defpackage.s21
    public final boolean fnWB2E7cs(defpackage.hyxIchWRW hyxichwrw, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (hyxichwrw) {
            try {
                if (hyxichwrw.adDC3e2L != obj) {
                    return false;
                }
                hyxichwrw.adDC3e2L = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s21
    public final boolean kNAkVymC(defpackage.hyxIchWRW hyxichwrw, defpackage.mAr5m2L7gYDP mar5m2l7gydp, defpackage.mAr5m2L7gYDP mar5m2l7gydp2) {
        synchronized (hyxichwrw) {
            try {
                if (hyxichwrw.AARZUJiTa != mar5m2l7gydp) {
                    return false;
                }
                hyxichwrw.AARZUJiTa = mar5m2l7gydp2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s21
    public final void wKlPRKlRnfqr(defpackage.mAr5m2L7gYDP mar5m2l7gydp, java.lang.Thread thread) {
        mar5m2l7gydp.IHQe1A4L2xu = thread;
    }
}
