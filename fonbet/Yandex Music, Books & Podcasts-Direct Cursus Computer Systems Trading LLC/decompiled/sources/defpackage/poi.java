package defpackage;

/* loaded from: classes.dex */
public interface poi extends cjc, aqi {
    @Override // defpackage.sdr
    default Object getValue() {
        return Float.valueOf(((t6k) this).e());
    }

    @Override // defpackage.aqi
    default void setValue(Object obj) {
        ((t6k) this).h(((Number) obj).floatValue());
    }
}
