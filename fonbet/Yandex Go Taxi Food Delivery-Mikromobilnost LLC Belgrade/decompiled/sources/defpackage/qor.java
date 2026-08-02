package defpackage;

/* loaded from: classes.dex */
public interface qor extends m3u0 {
    float getFloatValue();

    @Override // defpackage.m3u0
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}
