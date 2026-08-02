package splitties.init;

import android.content.Context;
import defpackage.nya1;
import defpackage.xwv;
import defpackage.yci0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsplitties/init/AppCtxInitializer;", "Lxwv;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lsplitties/init/AppCtxInitializer;", "", "", "dependencies", "()Ljava/util/List;", "splitties-appctx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class AppCtxInitializer implements xwv {
    @Override // defpackage.xwv
    public AppCtxInitializer create(Context context) {
        if (nya1.a(context)) {
            yci0.x("The passed Context(", context, ") would leak memory!");
            return null;
        }
        nya1.a = context;
        return this;
    }

    @Override // defpackage.xwv
    public List dependencies() {
        return EmptyList.a;
    }
}
