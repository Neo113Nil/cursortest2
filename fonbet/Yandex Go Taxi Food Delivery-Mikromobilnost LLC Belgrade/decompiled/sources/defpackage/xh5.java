package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.theme.Theme;

/* loaded from: classes12.dex */
public final class xh5 implements vh5 {
    public final Context a;

    public xh5(Context context) {
        this.a = context;
    }

    @Override // defpackage.vh5
    public final Integer a() {
        return null;
    }

    @Override // defpackage.vh5
    public final Theme getTheme() {
        return brb1.c(this.a) ? Theme.NIGHT : Theme.DAY;
    }
}
