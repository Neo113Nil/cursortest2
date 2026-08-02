package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "T"}, k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class fc7 extends uif implements Function0<File> {
    public final /* synthetic */ Context r;
    public final /* synthetic */ gc7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc7(Context context, gc7 gc7Var) {
        super(0);
        this.r = context;
        this.s = gc7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.r;
        context.getClass();
        return datastore_release.a(context, this.s.a);
    }
}
