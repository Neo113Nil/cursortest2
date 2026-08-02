package com.yandex.music.shared.wizard.entry.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wizard.entry.data.dto.WizardEntryBlockDto;
import defpackage.b80;
import defpackage.c3s;
import defpackage.kpt;
import defpackage.lzc;
import defpackage.o3f;
import defpackage.r6n;
import defpackage.xtd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\t\u0010\nJM\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\t\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/wizard/entry/data/WizardMonolithApi;", "", "Lo3f;", "", "artistIds", "cacheControl", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/wizard/entry/data/dto/WizardEntryBlockDto;", "getWizardEntryBlock", "(Lo3f;Ljava/lang/String;)Lretrofit2/Call;", "url", "Lb80;", "analyticsKey", "(Ljava/lang/String;Lo3f;Lb80;Ljava/lang/String;)Lretrofit2/Call;", "shared-wizard-entry-point"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface WizardMonolithApi {
    @lzc
    @NotNull
    Call<MusicBackendResponse<WizardEntryBlockDto>> getWizardEntryBlock(@kpt @NotNull String url, @r6n("artist-ids") @NotNull o3f artistIds, @c3s b80 analyticsKey, @xtd("Cache-Control") String cacheControl);

    @lzc("feed/wizard/entry-block")
    @NotNull
    Call<MusicBackendResponse<WizardEntryBlockDto>> getWizardEntryBlock(@r6n("artist-ids") @NotNull o3f artistIds, @xtd("Cache-Control") String cacheControl);
}
