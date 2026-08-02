package ru.yandex.music.catalog.playlist.editor;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.btf;
import defpackage.cvl;
import defpackage.g3m;
import defpackage.hag;
import defpackage.jh1;
import defpackage.jyr;
import defpackage.l18;
import defpackage.su4;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.editor.PlaylistEditorActivity;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class PlaylistEditorActivity extends a {
    public static final /* synthetic */ int w0 = 0;
    public final jyr Y = l18.b.b(hag.I(g3m.class), true);
    public final jyr Z;
    public final jyr v0;

    public PlaylistEditorActivity() {
        final int i = 0;
        this.Z = btf.b(new Function0(this) { // from class: uul
            public final /* synthetic */ PlaylistEditorActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlaylistEditorActivity playlistEditorActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = PlaylistEditorActivity.w0;
                        ((g3m) playlistEditorActivity.Y.getValue()).getClass();
                        return e3m.class;
                    default:
                        int i4 = PlaylistEditorActivity.w0;
                        Serializable serializableExtra = playlistEditorActivity.getIntent().getSerializableExtra("extra.playlist.header");
                        if (serializableExtra instanceof cvl) {
                            return (cvl) serializableExtra;
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.v0 = btf.b(new Function0(this) { // from class: uul
            public final /* synthetic */ PlaylistEditorActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlaylistEditorActivity playlistEditorActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = PlaylistEditorActivity.w0;
                        ((g3m) playlistEditorActivity.Y.getValue()).getClass();
                        return e3m.class;
                    default:
                        int i4 = PlaylistEditorActivity.w0;
                        Serializable serializableExtra = playlistEditorActivity.getIntent().getSerializableExtra("extra.playlist.header");
                        if (serializableExtra instanceof cvl) {
                            return (cvl) serializableExtra;
                        }
                        return null;
                }
            }
        });
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        cvl cvlVar = (cvl) this.v0.getValue();
        if (cvlVar != null) {
            supportFragmentManager.B = new jh1(5, this, cvlVar);
        }
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.fragment_container_view, (Class) this.Z.getValue(), null);
            l.j();
        }
    }
}
