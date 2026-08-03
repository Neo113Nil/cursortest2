package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d8.m f7837a;

    public l(d8.m mVar) {
        this.f7837a = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [oc.c, pc.k] */
    @Override // x.i0
    public final float a(float f10) {
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        d8.m mVar = this.f7837a;
        float floatValue = ((Number) ((pc.k) mVar.f1797a).invoke(Float.valueOf(f10))).floatValue();
        ((m0.l1) mVar.f1801e).setValue(Boolean.valueOf(floatValue > 0.0f));
        ((m0.l1) mVar.f1802f).setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
