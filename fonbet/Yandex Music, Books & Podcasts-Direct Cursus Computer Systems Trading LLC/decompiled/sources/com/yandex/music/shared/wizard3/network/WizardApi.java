package com.yandex.music.shared.wizard3.network;

import androidx.annotation.Keep;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wizard3.network.dto.WizardInitialArtistsDto;
import com.yandex.music.shared.wizard3.network.dto.WizardInitialArtistsRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardLikeDto;
import com.yandex.music.shared.wizard3.network.dto.WizardLikeRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsByTapDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsByTapRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardUnlikeDto;
import com.yandex.music.shared.wizard3.network.dto.WizardUnlikeRequestDto;
import defpackage.a0k;
import defpackage.b0k;
import defpackage.k83;
import defpackage.lzc;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\nH'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\rH'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0010H'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0013H'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003H'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/wizard3/network/WizardApi;", "", "getInitialArtists", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/wizard3/network/dto/WizardInitialArtistsDto;", ServiceCommand.TYPE_REQ, "Lcom/yandex/music/shared/wizard3/network/dto/WizardInitialArtistsRequestDto;", "getSimilarArtists", "Lcom/yandex/music/shared/wizard3/network/dto/WizardSimilarArtistsDto;", "Lcom/yandex/music/shared/wizard3/network/dto/WizardSimilarArtistsRequestDto;", "getSimilarArtistsByTap", "Lcom/yandex/music/shared/wizard3/network/dto/WizardSimilarArtistsByTapDto;", "Lcom/yandex/music/shared/wizard3/network/dto/WizardSimilarArtistsByTapRequestDto;", "addLikedArtist", "Lcom/yandex/music/shared/wizard3/network/dto/WizardLikeDto;", "Lcom/yandex/music/shared/wizard3/network/dto/WizardLikeRequestDto;", "removeLikedArtist", "Lcom/yandex/music/shared/wizard3/network/dto/WizardUnlikeDto;", "Lcom/yandex/music/shared/wizard3/network/dto/WizardUnlikeRequestDto;", "close", "", "finish", "shared-wizard3"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface WizardApi {
    @a0k("wizard3/like")
    @NotNull
    Call<MusicBackendResponse<WizardLikeDto>> addLikedArtist(@k83 @NotNull WizardLikeRequestDto request);

    @b0k("wizard3/close")
    @NotNull
    Call<MusicBackendResponse<Unit>> close();

    @lzc("wizard3/finish")
    @NotNull
    Call<MusicBackendResponse<Unit>> finish();

    @a0k("wizard3/initial-artists")
    @NotNull
    Call<MusicBackendResponse<WizardInitialArtistsDto>> getInitialArtists(@k83 @NotNull WizardInitialArtistsRequestDto request);

    @a0k("wizard3/similar-artists")
    @NotNull
    Call<MusicBackendResponse<WizardSimilarArtistsDto>> getSimilarArtists(@k83 @NotNull WizardSimilarArtistsRequestDto request);

    @a0k("wizard3/similar-artists-by-tap")
    @NotNull
    Call<MusicBackendResponse<WizardSimilarArtistsByTapDto>> getSimilarArtistsByTap(@k83 @NotNull WizardSimilarArtistsByTapRequestDto request);

    @a0k("wizard3/unlike")
    @NotNull
    Call<MusicBackendResponse<WizardUnlikeDto>> removeLikedArtist(@k83 @NotNull WizardUnlikeRequestDto request);
}
