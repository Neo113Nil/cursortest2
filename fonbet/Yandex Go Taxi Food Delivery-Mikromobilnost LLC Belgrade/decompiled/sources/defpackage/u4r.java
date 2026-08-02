package defpackage;

import android.content.Context;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class u4r {
    public final Context a;

    public u4r(Context context) {
        this.a = context;
    }

    public final String a(FoldersConfig.Filter filter) {
        Object failure;
        Context context = this.a;
        try {
            failure = context.getString(context.getResources().getIdentifier(g8e.o("filter_", filter.getI18nKey()), "string", context.getPackageName()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object name = filter.getName();
        if (failure instanceof Result.Failure) {
            failure = name;
        }
        return (String) failure;
    }
}
