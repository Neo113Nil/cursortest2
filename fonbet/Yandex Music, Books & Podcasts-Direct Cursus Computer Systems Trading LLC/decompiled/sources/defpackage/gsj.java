package defpackage;

import com.yandex.music.plus.features.quests.network.QuestsBlockDataDto;
import com.yandex.music.plus.features.quests.network.QuestsBlockDto;
import com.yandex.music.shared.skeleton.blocks.openplaylist.OpenPlaylistBlockDto;
import com.yandex.music.shared.skeleton.blocks.openplaylist.OpenPlaylistDataDto;
import com.yandex.music.shared.skeleton.blocks.simpleplaylist.SimplePlaylistBlockDto;
import com.yandex.music.shared.skeleton.blocks.simpleplaylist.SimplePlaylistDataDto;
import com.yandex.music.shared.skeleton.blocks.waveagents.WaveAgentsBlockDto;
import com.yandex.music.shared.skeleton.blocks.waveagents.WaveAgentsDataDto;
import com.yandex.music.shared.skeleton.blocks.waves.WavesBlockDto;
import com.yandex.music.shared.skeleton.blocks.waves.WavesDataDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.SkeletonBlockSourceDto;
import com.yandex.music.shared.staticdivblock.data.ConditionDto;
import com.yandex.music.shared.staticdivblock.data.StaticDivBlockDto;
import com.yandex.music.shared.staticdivblock.data.StaticDivDataDto;
import com.yandex.music.skeleton.blocks.overview.data.OverviewBlockDto;
import com.yandex.music.skeleton.blocks.overview.data.OverviewDataDto;
import com.yandex.music.skeleton.blocks.pay_offers.data.dto.PayOffersBlockDataDto;
import com.yandex.music.skeleton.blocks.pay_offers.data.dto.PayOffersBlockDto;
import com.yandex.music.skeleton.blocks.playlist_with_likes.data.PlaylistWithLikesBlockDto;
import com.yandex.music.skeleton.blocks.playlist_with_likes.data.PlaylistWithLikesDataDto;
import com.yandex.music.skeleton.blocks.promo.data.PromoBlockDto;
import com.yandex.music.skeleton.blocks.promo.data.PromoDataDto;
import com.yandex.music.skeleton.blocks.special.data.SpecialBlockDto;
import com.yandex.music.skeleton.blocks.special.data.SpecialDataDto;
import com.yandex.music.skeleton.blocks.unknown_type.data.UnknownTypeBlockDto;
import com.yandex.music.skeleton.blocks.unknown_type.data.UnknownTypeDataDto;
import com.yandex.music.skeleton.blocks.wizard.data.WizardBlockDataDto;
import com.yandex.music.skeleton.blocks.wizard.data.WizardBlockDto;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class gsj implements fnq {
    public final /* synthetic */ int a;

    public /* synthetic */ gsj(int i) {
        this.a = i;
    }

    @Override // defpackage.fnq
    public final Class a() {
        switch (this.a) {
            case 0:
                return OpenPlaylistBlockDto.class;
            case 1:
                return OverviewBlockDto.class;
            case 2:
                return PayOffersBlockDto.class;
            case 3:
                return PlaylistWithLikesBlockDto.class;
            case 4:
                return PromoBlockDto.class;
            case 5:
                return QuestsBlockDto.class;
            case 6:
                return SimplePlaylistBlockDto.class;
            case 7:
                return SpecialBlockDto.class;
            case 8:
                return StaticDivBlockDto.class;
            case 9:
                return UnknownTypeBlockDto.class;
            case 10:
                return WaveAgentsBlockDto.class;
            case 11:
                return WavesBlockDto.class;
            default:
                return WizardBlockDto.class;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final drf b(inq inqVar) {
        String title;
        Integer count;
        String message;
        SkeletonBlockSourceDto source;
        onq z0;
        f73 f73Var;
        SkeletonBlockSourceDto source2;
        nrf S;
        String title2;
        onq z02;
        SkeletonBlockSourceDto source3;
        onq z03;
        nrf S2;
        SkeletonBlockSourceDto source4;
        onq z04;
        String screenId;
        Object obj;
        ConditionDto showCondition;
        hfr hfrVar;
        hfr cfrVar;
        String meta;
        ad6 w;
        Set P;
        String meta2;
        Set P2;
        String meta3;
        ad6 w2;
        Set P3;
        String meta4;
        ad6 w3;
        Set P4;
        String meta5;
        Set P5;
        String meta6;
        ad6 w4;
        Set P6;
        String meta7;
        ad6 w5;
        onq onqVar;
        SkeletonBlockSourceDto source5;
        SkeletonBlockSourceDto source6;
        onq z05;
        SkeletonBlockSourceDto source7;
        onq z06;
        WizardBlockDataDto data;
        SkeletonBlockSourceDto source8;
        onq z07;
        switch (this.a) {
            case 0:
                OpenPlaylistBlockDto openPlaylistBlockDto = (OpenPlaylistBlockDto) inqVar;
                OpenPlaylistDataDto data2 = openPlaylistBlockDto.getData();
                nrf S3 = v5g.S(openPlaylistBlockDto);
                if (S3 != null && data2 != null && (title = data2.getTitle()) != null) {
                    String description = data2.getDescription();
                    SkeletonBlockSourceDto source9 = data2.getSource();
                    if (source9 != null && (count = source9.getCount()) != null) {
                        int intValue = count.intValue();
                        onq z08 = y5g.z0(data2.getSource());
                        if (z08 != null) {
                            gos gosVar = f73.b;
                            String showPolicy = data2.getShowPolicy();
                            gosVar.getClass();
                            f73 s = gos.s(showPolicy);
                            i9w i9wVar = ho6.b;
                            String coverStyle = data2.getCoverStyle();
                            i9wVar.getClass();
                            return new fsj(S3, z08, s, title, description, i9w.B(coverStyle), intValue);
                        }
                    }
                }
                return null;
            case 1:
                OverviewBlockDto overviewBlockDto = (OverviewBlockDto) inqVar;
                OverviewDataDto data3 = overviewBlockDto.getData();
                nrf S4 = v5g.S(overviewBlockDto);
                if (S4 == null || data3 == null || (message = data3.getMessage()) == null) {
                    return null;
                }
                String title3 = data3.getTitle();
                Boolean expandable = data3.getExpandable();
                boolean booleanValue = expandable != null ? expandable.booleanValue() : true;
                Integer visibleLines = data3.getVisibleLines();
                return new mzj(S4, title3, message, booleanValue, visibleLines != null ? visibleLines.intValue() : 3);
            case 2:
                PayOffersBlockDto payOffersBlockDto = (PayOffersBlockDto) inqVar;
                PayOffersBlockDataDto data4 = payOffersBlockDto.getData();
                nrf S5 = v5g.S(payOffersBlockDto);
                if (S5 == null) {
                    su4.s(2, null, "Invalid PayOffersBlockDto", null);
                }
                if (S5 == null || data4 == null || (source = data4.getSource()) == null || (z0 = y5g.z0(source)) == null) {
                    return null;
                }
                String showPolicy2 = data4.getShowPolicy();
                if (showPolicy2 != null) {
                    f73.b.getClass();
                    f73Var = gos.s(showPolicy2);
                } else {
                    f73Var = f73.d;
                }
                return new ick(S5, z0, f73Var, data4.getTitle());
            case 3:
                PlaylistWithLikesBlockDto playlistWithLikesBlockDto = (PlaylistWithLikesBlockDto) inqVar;
                PlaylistWithLikesDataDto data5 = playlistWithLikesBlockDto.getData();
                nrf S6 = v5g.S(playlistWithLikesBlockDto);
                if (S6 == null) {
                    return null;
                }
                return new i4m(S6, data5 != null ? data5.getTitle() : null);
            case 4:
                PromoBlockDto promoBlockDto = (PromoBlockDto) inqVar;
                PromoDataDto data6 = promoBlockDto.getData();
                nrf S7 = v5g.S(promoBlockDto);
                if (S7 == null) {
                    su4.s(2, null, "Invalid PromoBlockDto", null);
                }
                if (S7 == null) {
                    return null;
                }
                String title4 = data6 != null ? data6.getTitle() : null;
                onq z09 = (data6 == null || (source2 = data6.getSource()) == null) ? null : y5g.z0(source2);
                if (z09 == null) {
                    su4.s(2, null, "Invalid PromoBlockDto", null);
                }
                if (z09 == null) {
                    return null;
                }
                gos gosVar2 = f73.b;
                String showPolicy3 = data6 != null ? data6.getShowPolicy() : null;
                gosVar2.getClass();
                return new fwm(S7, z09, gos.s(showPolicy3), title4);
            case 5:
                QuestsBlockDto questsBlockDto = (QuestsBlockDto) inqVar;
                QuestsBlockDataDto data7 = questsBlockDto.getData();
                if (data7 == null || (S = v5g.S(questsBlockDto)) == null) {
                    return null;
                }
                String title5 = data7.getTitle();
                onq onqVar2 = new onq("");
                gos gosVar3 = f73.b;
                String showPolicy4 = data7.getShowPolicy();
                gosVar3.getClass();
                return new b8n(S, onqVar2, gos.s(showPolicy4), title5);
            case 6:
                SimplePlaylistBlockDto simplePlaylistBlockDto = (SimplePlaylistBlockDto) inqVar;
                SimplePlaylistDataDto data8 = simplePlaylistBlockDto.getData();
                nrf S8 = v5g.S(simplePlaylistBlockDto);
                if (S8 != null && data8 != null && (title2 = data8.getTitle()) != null) {
                    String description2 = data8.getDescription();
                    i9w i9wVar2 = ho6.b;
                    String coverStyle2 = data8.getCoverStyle();
                    i9wVar2.getClass();
                    ho6 B = i9w.B(coverStyle2);
                    SkeletonBlockSourceDto source10 = data8.getSource();
                    if (source10 != null && (z02 = y5g.z0(source10)) != null) {
                        return new djq(S8, z02, B, title2, description2);
                    }
                }
                return null;
            case 7:
                SpecialBlockDto specialBlockDto = (SpecialBlockDto) inqVar;
                SpecialDataDto data9 = specialBlockDto.getData();
                nrf S9 = v5g.S(specialBlockDto);
                if (S9 == null) {
                    return null;
                }
                String title6 = data9 != null ? data9.getTitle() : null;
                if (data9 == null || (source3 = data9.getSource()) == null || (z03 = y5g.z0(source3)) == null) {
                    return null;
                }
                return new v4r(S9, z03, title6);
            case 8:
                StaticDivBlockDto staticDivBlockDto = (StaticDivBlockDto) inqVar;
                StaticDivDataDto data10 = staticDivBlockDto.getData();
                if (data10 == null || (S2 = v5g.S(staticDivBlockDto)) == null || (source4 = staticDivBlockDto.getData().getSource()) == null || (z04 = y5g.z0(source4)) == null || (screenId = data10.getScreenId()) == null) {
                    return null;
                }
                ybl yblVar = wfr.b;
                String size = data10.getSize();
                yblVar.getClass();
                Iterator it = wfr.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((wfr) obj).a.equalsIgnoreCase(size)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                wfr wfrVar = (wfr) obj;
                if (wfrVar == null || (showCondition = data10.getShowCondition()) == null) {
                    return null;
                }
                String condition = showCondition.getCondition();
                if (condition != null) {
                    switch (condition.hashCode()) {
                        case -1469422235:
                            if (condition.equals("APP_INSTALLED_AND_HAS_OPTION") && (meta = showCondition.getMeta()) != null && (w = v7g.w(meta)) != null && (P = v7g.P(showCondition.getMeta())) != null) {
                                cfrVar = new cfr(w, P);
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                        case -850103652:
                            if (condition.equals("APP_INSTALLED") && (meta2 = showCondition.getMeta()) != null && (P2 = v7g.P(meta2)) != null) {
                                cfrVar = new afr(P2);
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                        case -769075913:
                            if (condition.equals("APP_NOT_INSTALLED_AND_HAS_NO_OPTION") && (meta3 = showCondition.getMeta()) != null && (w2 = v7g.w(meta3)) != null && (P3 = v7g.P(showCondition.getMeta())) != null) {
                                cfrVar = new efr(w2, P3);
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                        case 159077827:
                            if (condition.equals("APP_INSTALLED_AND_HAS_NO_OPTION") && (meta4 = showCondition.getMeta()) != null && (w3 = v7g.w(meta4)) != null && (P4 = v7g.P(showCondition.getMeta())) != null) {
                                cfrVar = new bfr(w3, P4);
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                        case 240875309:
                            if (condition.equals("ALWAYS_SHOW")) {
                                cfrVar = zer.a;
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                        case 343058192:
                            if (condition.equals("APP_NOT_INSTALLED") && (meta5 = showCondition.getMeta()) != null && (P5 = v7g.P(meta5)) != null) {
                                cfrVar = new dfr(P5);
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                        case 1488337521:
                            if (condition.equals("APP_NOT_INSTALLED_AND_HAS_OPTION") && (meta6 = showCondition.getMeta()) != null && (w4 = v7g.w(meta6)) != null && (P6 = v7g.P(showCondition.getMeta())) != null) {
                                cfrVar = new ffr(w4, P6);
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                        case 1585440046:
                            if (condition.equals("HAS_NO_OPTION") && (meta7 = showCondition.getMeta()) != null && (w5 = v7g.w(meta7)) != null) {
                                cfrVar = new gfr(w5);
                                hfrVar = cfrVar;
                                break;
                            }
                            break;
                    }
                    if (hfrVar != null) {
                        return null;
                    }
                    return new yer(S2, z04, screenId, wfrVar, hfrVar);
                }
                hfrVar = null;
                if (hfrVar != null) {
                }
                break;
            case 9:
                UnknownTypeBlockDto unknownTypeBlockDto = (UnknownTypeBlockDto) inqVar;
                UnknownTypeDataDto data11 = unknownTypeBlockDto.getData();
                nrf S10 = v5g.S(unknownTypeBlockDto);
                if (S10 == null) {
                    return null;
                }
                String title7 = data11 != null ? data11.getTitle() : null;
                String description3 = data11 != null ? data11.getDescription() : null;
                if (data11 == null || (source5 = data11.getSource()) == null || (onqVar = y5g.z0(source5)) == null) {
                    onqVar = new onq("null");
                }
                onq onqVar3 = onqVar;
                gos gosVar4 = f73.b;
                String showPolicy5 = data11 != null ? data11.getShowPolicy() : null;
                gosVar4.getClass();
                return new qkt(gos.s(showPolicy5), S10, onqVar3, title7, description3);
            case 10:
                WaveAgentsBlockDto waveAgentsBlockDto = (WaveAgentsBlockDto) inqVar;
                WaveAgentsDataDto data12 = waveAgentsBlockDto.getData();
                nrf S11 = v5g.S(waveAgentsBlockDto);
                if (S11 == null) {
                    return null;
                }
                String title8 = data12 != null ? data12.getTitle() : null;
                if (data12 == null || (source6 = data12.getSource()) == null || (z05 = y5g.z0(source6)) == null) {
                    return null;
                }
                gos gosVar5 = f73.b;
                String showPolicy6 = data12.getShowPolicy();
                gosVar5.getClass();
                return new mlu(S11, z05, gos.s(showPolicy6), title8);
            case 11:
                WavesBlockDto wavesBlockDto = (WavesBlockDto) inqVar;
                WavesDataDto data13 = wavesBlockDto.getData();
                nrf S12 = v5g.S(wavesBlockDto);
                if (S12 == null) {
                    return null;
                }
                String title9 = data13 != null ? data13.getTitle() : null;
                if (data13 == null || (source7 = data13.getSource()) == null || (z06 = y5g.z0(source7)) == null) {
                    return null;
                }
                gos gosVar6 = f73.b;
                String showPolicy7 = data13.getShowPolicy();
                gosVar6.getClass();
                return new gav(S12, z06, gos.s(showPolicy7), title9);
            default:
                WizardBlockDto wizardBlockDto = (WizardBlockDto) inqVar;
                nrf S13 = v5g.S(wizardBlockDto);
                if (S13 == null || (data = wizardBlockDto.getData()) == null || (source8 = data.getSource()) == null || (z07 = y5g.z0(source8)) == null) {
                    return null;
                }
                return new ptv(S13, z07);
        }
    }
}
