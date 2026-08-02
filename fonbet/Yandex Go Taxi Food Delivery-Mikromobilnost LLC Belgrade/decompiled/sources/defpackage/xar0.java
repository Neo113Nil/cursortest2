package defpackage;

import android.content.Context;
import com.yandex.go.settings.mvp.SettingsModalView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class xar0 extends jey {
    public final /* synthetic */ SettingsModalView a;

    public xar0(SettingsModalView settingsModalView) {
        this.a = settingsModalView;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onPause() {
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onResume() {
        yar0 binding;
        j5z j5zVar;
        SettingsModalView settingsModalView = this.a;
        binding = settingsModalView.getBinding();
        ListItemComponent listItemComponent = binding.j;
        j5zVar = settingsModalView.localeHelper;
        i5z a = j5zVar.a.a();
        Context context = j5zVar.f;
        a.getClass();
        listItemComponent.setSubtitle(context.getResources().getString(a.c));
        settingsModalView.handlePushSettingsSystemState();
    }
}
