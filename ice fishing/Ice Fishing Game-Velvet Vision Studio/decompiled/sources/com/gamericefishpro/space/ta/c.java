package com.gamericefishpro.space.ta;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public final Object d;

    public c(Object obj) {
        this.d = obj;
    }

    @Override // com.gamericefishpro.space.ta.b
    public final Object a() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.ta.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.d.equals(((c) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
