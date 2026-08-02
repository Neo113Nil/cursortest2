package defpackage;

import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import com.yandex.music.shared.dto.wave.AgentCoverDto;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.NewWaveModelDto;
import com.yandex.music.shared.dto.wave.NewWaveModelWithAgentDto;
import com.yandex.music.shared.dto.wave.WaveDomainItemWithAgentDto;
import com.yandex.music.shared.history.data.network.dto.AlbumFullModelDto;
import com.yandex.music.shared.history.data.network.dto.PlaylistFullModelDto;
import com.yandex.music.shared.history.data.network.dto.QueryToVibeItemIdDto;
import com.yandex.music.shared.history.data.network.dto.WaveFullModelDto;
import com.yandex.music.shared.history.data.network.dto.WaveItemIdDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class xj6 {
    public static final qii a(AlbumFullModelDto albumFullModelDto) {
        lt J;
        List<ArtistDomainItemDto> artists;
        Boolean available;
        AlbumDomainItemDto album = albumFullModelDto.getAlbum();
        if (album == null || (J = xee.J(album)) == null || (artists = albumFullModelDto.getArtists()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ArtistDomainItemDto artistDomainItemDto : artists) {
            u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
            if (K != null) {
                arrayList.add(K);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null || (available = albumFullModelDto.getAvailable()) == null) {
            return null;
        }
        return new qii(J, arrayList, available.booleanValue());
    }

    public static final sii b(NewWaveModelWithAgentDto newWaveModelWithAgentDto) {
        dou a;
        AgentCoverDto cover;
        NewWaveModelDto wave = newWaveModelWithAgentDto.getWave();
        String str = null;
        if (wave == null || (a = wave.a()) == null) {
            return null;
        }
        AgentDto agentDto = newWaveModelWithAgentDto.getAgentDto();
        if (agentDto != null && (cover = agentDto.getCover()) != null) {
            str = cover.getUri();
        }
        return new sii(a, str);
    }

    public static final tii c(PlaylistFullModelDto playlistFullModelDto) {
        eul H;
        Integer tracksCount;
        PlaylistDomainItemDto playlist = playlistFullModelDto.getPlaylist();
        if (playlist == null || (H = neg.H(playlist)) == null || (tracksCount = playlistFullModelDto.getTracksCount()) == null) {
            return null;
        }
        int intValue = tracksCount.intValue();
        Boolean available = playlistFullModelDto.getAvailable();
        if (available != null) {
            return new tii(H, intValue, available.booleanValue());
        }
        return null;
    }

    public static final eji d(QueryToVibeItemIdDto queryToVibeItemIdDto) {
        List seeds = queryToVibeItemIdDto.getSeeds();
        if (seeds == null) {
            return null;
        }
        ArrayList O = CollectionsKt.O(seeds);
        if (O.isEmpty()) {
            O = null;
        }
        if (O == null) {
            return null;
        }
        return new eji(O);
    }

    public static final yii e(WaveFullModelDto waveFullModelDto) {
        eou eouVar;
        dou douVar;
        np npVar;
        String simpleWaveForegroundImageUrl;
        String simpleWaveBackgroundColor;
        Integer b0;
        String stationId;
        List seeds;
        List E;
        String header;
        WaveDomainItemWithAgentDto wave = waveFullModelDto.getWave();
        if (wave != null && (stationId = wave.getStationId()) != null && (seeds = wave.getSeeds()) != null && (E = tyf.E(wave.getStationId(), seeds)) != null) {
            s9p E2 = o8g.E(E);
            String title = wave.getTitle();
            if (title != null && (header = wave.getHeader()) != null) {
                AgentDto agent = wave.getAgent();
                eouVar = new eou(stationId, E2, title, header, agent != null ? w1g.E(agent) : null);
                if (eouVar != null && (douVar = eouVar.f) != null) {
                    npVar = eouVar.e;
                    simpleWaveForegroundImageUrl = waveFullModelDto.getSimpleWaveForegroundImageUrl();
                    simpleWaveBackgroundColor = waveFullModelDto.getSimpleWaveBackgroundColor();
                    if (simpleWaveBackgroundColor != null && (b0 = y2x.b0(simpleWaveBackgroundColor)) != null) {
                        return new yii(douVar, npVar, simpleWaveForegroundImageUrl, b0.intValue());
                    }
                }
                return null;
            }
        }
        eouVar = null;
        if (eouVar != null) {
            npVar = eouVar.e;
            simpleWaveForegroundImageUrl = waveFullModelDto.getSimpleWaveForegroundImageUrl();
            simpleWaveBackgroundColor = waveFullModelDto.getSimpleWaveBackgroundColor();
            if (simpleWaveBackgroundColor != null) {
                return new yii(douVar, npVar, simpleWaveForegroundImageUrl, b0.intValue());
            }
        }
        return null;
    }

    public static final fji f(WaveItemIdDto waveItemIdDto) {
        List seeds = waveItemIdDto.getSeeds();
        if (seeds == null) {
            return null;
        }
        ArrayList O = CollectionsKt.O(seeds);
        if (O.isEmpty()) {
            O = null;
        }
        if (O != null) {
            return new fji(o8g.E(O));
        }
        return null;
    }
}
