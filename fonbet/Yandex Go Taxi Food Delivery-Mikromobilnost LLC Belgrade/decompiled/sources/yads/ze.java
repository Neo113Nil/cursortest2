package yads;

import android.content.Context;
import defpackage.gg71;
import defpackage.ix81;
import defpackage.sls;
import defpackage.tr81;
import defpackage.tu81;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ze extends Lambda implements sls {
    public final /* synthetic */ gg71 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(gg71 gg71Var, Context context) {
        super(0);
        this.b = gg71Var;
        this.c = context;
    }

    @Override // defpackage.sls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tr81 invoke() {
        if (this.b.c()) {
            try {
                tu81 tu81Var = ix81.b;
                if (tu81Var == null) {
                    tu81Var = ix81.a;
                }
                return tu81Var.a(this.c);
            } catch (Throwable th) {
                th.toString();
            }
        }
        return null;
    }
}
