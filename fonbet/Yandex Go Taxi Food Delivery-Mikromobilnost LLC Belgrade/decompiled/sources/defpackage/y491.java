package defpackage;

import java.io.File;

/* loaded from: classes11.dex */
public final class y491 implements id91 {
    public final /* synthetic */ int a;
    public final id91 b;

    public /* synthetic */ y491(id91 id91Var, int i) {
        this.a = i;
        this.b = id91Var;
    }

    @Override // defpackage.id91
    public final Object zza() {
        int i = this.a;
        id91 id91Var = this.b;
        switch (i) {
            case 0:
                File file = (File) id91Var.zza();
                if (file == null) {
                    return null;
                }
                return c491.a(file);
            default:
                esa1 esa1Var = (esa1) id91Var.zza();
                if (esa1Var != null) {
                    return esa1Var;
                }
                ny61.t("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
