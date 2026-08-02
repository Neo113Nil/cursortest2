package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class css {
    public static final ovk d;
    public static final jyr e;
    public static final css f;
    public static final css g;
    public static final css h;
    public static final css i;
    public static final css j;
    public static final /* synthetic */ css[] k;
    public static final /* synthetic */ rdb l;
    public final jyr a;
    public final jyr b;
    public final jyr c;

    static {
        css cssVar = new css("TemporaryCache", 0);
        f = cssVar;
        css cssVar2 = new css("AutoCache", 1);
        g = cssVar2;
        css cssVar3 = new css("SmartCache", 2);
        h = cssVar3;
        css cssVar4 = new css("PermanentStrong", 3);
        i = cssVar4;
        css cssVar5 = new css("PermanentWeak", 4);
        j = cssVar5;
        css[] cssVarArr = {cssVar, cssVar2, cssVar3, cssVar4, cssVar5};
        k = cssVarArr;
        l = new rdb(cssVarArr);
        d = new ovk();
        e = btf.b(new x6s(13));
    }

    public css(String str, int i2) {
        final int i3 = 0;
        this.a = btf.b(new Function0(this) { // from class: bss
            public final /* synthetic */ css b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                boolean z2;
                boolean z3;
                switch (i3) {
                    case 0:
                        int ordinal = this.b.ordinal();
                        if (ordinal != 0) {
                            z = true;
                            if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                                b6e.s();
                                return null;
                            }
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        int ordinal2 = this.b.ordinal();
                        if (ordinal2 != 0) {
                            z2 = true;
                            if (ordinal2 != 1 && ordinal2 != 2) {
                                if (ordinal2 != 3 && ordinal2 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            return Boolean.valueOf(z2);
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        int ordinal3 = this.b.ordinal();
                        if (ordinal3 != 0) {
                            z3 = true;
                            if (ordinal3 != 1 && ordinal3 != 2 && ordinal3 != 3) {
                                if (ordinal3 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            return Boolean.valueOf(z3);
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i4 = 1;
        this.b = btf.b(new Function0(this) { // from class: bss
            public final /* synthetic */ css b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                boolean z2;
                boolean z3;
                switch (i4) {
                    case 0:
                        int ordinal = this.b.ordinal();
                        if (ordinal != 0) {
                            z = true;
                            if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                                b6e.s();
                                return null;
                            }
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        int ordinal2 = this.b.ordinal();
                        if (ordinal2 != 0) {
                            z2 = true;
                            if (ordinal2 != 1 && ordinal2 != 2) {
                                if (ordinal2 != 3 && ordinal2 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            return Boolean.valueOf(z2);
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        int ordinal3 = this.b.ordinal();
                        if (ordinal3 != 0) {
                            z3 = true;
                            if (ordinal3 != 1 && ordinal3 != 2 && ordinal3 != 3) {
                                if (ordinal3 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            return Boolean.valueOf(z3);
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i5 = 2;
        this.c = btf.b(new Function0(this) { // from class: bss
            public final /* synthetic */ css b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                boolean z2;
                boolean z3;
                switch (i5) {
                    case 0:
                        int ordinal = this.b.ordinal();
                        if (ordinal != 0) {
                            z = true;
                            if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                                b6e.s();
                                return null;
                            }
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        int ordinal2 = this.b.ordinal();
                        if (ordinal2 != 0) {
                            z2 = true;
                            if (ordinal2 != 1 && ordinal2 != 2) {
                                if (ordinal2 != 3 && ordinal2 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            return Boolean.valueOf(z2);
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        int ordinal3 = this.b.ordinal();
                        if (ordinal3 != 0) {
                            z3 = true;
                            if (ordinal3 != 1 && ordinal3 != 2 && ordinal3 != 3) {
                                if (ordinal3 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            return Boolean.valueOf(z3);
                        }
                        z3 = false;
                        return Boolean.valueOf(z3);
                }
            }
        });
    }

    public static css valueOf(String str) {
        return (css) Enum.valueOf(css.class, str);
    }

    public static css[] values() {
        return (css[]) k.clone();
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }
}
