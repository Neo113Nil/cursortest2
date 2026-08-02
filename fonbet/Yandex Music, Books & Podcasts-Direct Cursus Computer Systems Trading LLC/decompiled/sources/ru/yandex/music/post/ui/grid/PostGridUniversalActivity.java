package ru.yandex.music.post.ui.grid;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.cxb;
import defpackage.hag;
import defpackage.jim;
import defpackage.l18;
import defpackage.lg3;
import defpackage.qxm;
import defpackage.yhb;
import java.util.HashMap;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class PostGridUniversalActivity extends a {
    public static final /* synthetic */ int Z = 0;
    public final yhb Y = (yhb) l18.b.c(hag.I(yhb.class));

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("extra.event.id") : null;
        qxm a = this.Y.a(string);
        if (a == null) {
            Assertions.throwOrSkip("PostGridUniversalActivity", new FailedAssertionException("EventData is null"));
            finish();
            return;
        }
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            string.getClass();
            jim jimVar = new jim();
            jimVar.setArguments(cxb.K(new Pair("postGridUniversal:eventId", string)));
            aVar.e(R.id.fragment_container_view, jimVar, null);
            aVar.j();
            HashMap hashMap = new HashMap();
            hashMap.put("type", a.a());
            hashMap.put("title", a.a);
            lg3.e0("Post_MultiItemsWindow", hashMap);
        }
    }
}
