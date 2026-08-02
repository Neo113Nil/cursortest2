package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;

@we7(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, UibcKeyCode.TV_KEYCODE_9}, m = "runMigrations")
@Metadata(k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ha7<T> extends cg6 {
    public Serializable j;
    public Iterator k;
    public /* synthetic */ Object l;
    public int m;

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.m |= Integer.MIN_VALUE;
        return ka7.a(null, null, this);
    }
}
