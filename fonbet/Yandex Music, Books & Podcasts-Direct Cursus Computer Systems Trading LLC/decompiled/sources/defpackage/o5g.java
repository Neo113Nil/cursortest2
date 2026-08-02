package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.net.Uri;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.YandexMetricaPushTracker;
import com.yandex.music.shared.dto.artist.PreSaveContentRestrictionsDto;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.presave.PreSaveArtistDto;
import com.yandex.music.shared.dto.presave.UserPreSaveDto;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.NewWaveModelDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelGetWheelResponseDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDataDto$WheelItemDataAlbumDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDataDto$WheelItemDataPromoDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDataDto$WheelItemDataSettingsDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDataDto$WheelItemDataWaveDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDto$WheelItemAlbumDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDto$WheelItemPromoDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDto$WheelItemSettingsDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDto$WheelItemWaveDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public abstract class o5g {
    public static volatile uol a;
    public static boolean b;

    public static final ukd A(ukd ukdVar) {
        return ukdVar.d(new yov(p38.a));
    }

    public static final tgo C(hq5 hq5Var) {
        return ugo.a(u7g.E(R.dimen.corner_12, hq5Var));
    }

    public static final tgo D(hq5 hq5Var) {
        return ugo.a(u7g.E(R.dimen.corner_16, hq5Var));
    }

    public static final tgo E(hq5 hq5Var) {
        return ugo.a(u7g.E(R.dimen.corner_4, hq5Var));
    }

    public static final tgo F(hq5 hq5Var) {
        return ugo.a(u7g.E(R.dimen.corner_6, hq5Var));
    }

    public static final tgo G(hq5 hq5Var) {
        return ugo.a(u7g.E(R.dimen.corner_8, hq5Var));
    }

    public static final void H(Intent intent) {
        intent.getClass();
        if (intent.hasExtra(YandexMetricaPush.EXTRA_ACTION_INFO)) {
            String stringExtra = intent.getStringExtra("extra.push.remote.id");
            if (stringExtra == null) {
                su4.s(2, null, "Push id is not specified", null);
            }
            if (stringExtra == null) {
                return;
            }
            String stringExtra2 = intent.getStringExtra("extra.push.remote.transport");
            if (stringExtra2 == null) {
                su4.s(2, null, "Push transport is not specified", null);
            }
            if (stringExtra2 == null) {
                return;
            }
            String stringExtra3 = intent.getStringExtra("extra.push.remote.title");
            String stringExtra4 = intent.getStringExtra("extra.push.remote.action.uri");
            new YandexMetricaPushTracker().reportOpen(stringExtra, stringExtra2);
            lvn.b.g(stringExtra4, rd7.c(), stringExtra3, "Push_Opened");
        }
    }

    public static final ukd I(ukd ukdVar, float f) {
        return ukdVar.d(new bxd(new n38(f)));
    }

    public static boolean J(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final gli K(gli gliVar) {
        if (gliVar instanceof sji) {
            return lji.a;
        }
        if (gliVar instanceof tji) {
            return mji.a;
        }
        if (gliVar instanceof vji) {
            return oji.a;
        }
        if (gliVar instanceof xji) {
            return qji.a;
        }
        if (gliVar instanceof uji) {
            return nji.a;
        }
        if (gliVar instanceof wji) {
            return pji.a;
        }
        if (gliVar instanceof zki) {
            return wki.a;
        }
        if (gliVar instanceof ali) {
            return xki.a;
        }
        if (gliVar instanceof fki) {
            return gliVar;
        }
        if (gliVar instanceof mki) {
            return gliVar;
        }
        if (gliVar instanceof qki) {
            return gliVar;
        }
        if (gliVar instanceof vki) {
            return gliVar;
        }
        if (gliVar instanceof yki) {
            return gliVar;
        }
        if (gliVar instanceof eli) {
            return gliVar;
        }
        if (gliVar instanceof rji) {
            return gliVar;
        }
        if (gliVar instanceof jki) {
            return gliVar;
        }
        b6e.s();
        return null;
    }

    public static yqr L(yqr yqrVar) {
        return !(yqrVar instanceof drr) ? yqrVar instanceof crr ? yqrVar : yqrVar instanceof Serializable ? new crr(yqrVar) : new drr(yqrVar) : yqrVar;
    }

    public static final void M(oxq oxqVar, nw0 nw0Var, int i) {
        while (true) {
            int i2 = oxqVar.v;
            if (i > i2 && i < oxqVar.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            oxqVar.L();
            if (oxqVar.w(oxqVar.v)) {
                nw0Var.l();
            }
            oxqVar.i();
        }
    }

    public static final vat N(List list, int i, mse mseVar, int i2) {
        list.getClass();
        if (list.size() < i2) {
            return new vat(list, mseVar, Integer.valueOf(i));
        }
        if (mseVar == null) {
            Pair r = r(list.size(), i, i2);
            int intValue = ((Number) r.a).intValue();
            return new vat(list.subList(intValue, ((Number) r.b).intValue()), null, Integer.valueOf(i - intValue));
        }
        Pair r2 = r(list.size(), mseVar.indexOf(Integer.valueOf(i)), i2);
        List subList = mseVar.subList(((Number) r2.a).intValue(), ((Number) r2.b).intValue());
        List n0 = CollectionsKt.n0(subList);
        List list2 = n0;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(((Number) it.next()).intValue()));
        }
        ArrayList arrayList2 = new ArrayList(v75.o(subList, 10));
        Iterator it2 = subList.iterator();
        int i3 = -1;
        while (it2.hasNext()) {
            int intValue2 = ((Number) it2.next()).intValue();
            int e = u75.e(n0, Integer.valueOf(intValue2));
            if (intValue2 == i) {
                i3 = e;
            }
            arrayList2.add(Integer.valueOf(e));
        }
        return new vat(arrayList, arrayList2, Integer.valueOf(i3));
    }

    public static final ids O(int i, int i2, hq5 hq5Var) {
        boolean z = true;
        int i3 = (i2 & 1) != 0 ? 8 : 16;
        oq5 oq5Var = (oq5) hq5Var;
        ppc ppcVar = (ppc) oq5Var.j(es5.k);
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        xof xofVar = (xof) oq5Var.j(es5.n);
        boolean f = oq5Var.f(ppcVar) | oq5Var.f(jx7Var) | oq5Var.f(xofVar);
        if ((((i & 14) ^ 6) <= 4 || !oq5Var.d(i3)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = f | z;
        Object K = oq5Var.K();
        if (z2 || K == gq5.a) {
            K = new ids(ppcVar, jx7Var, xofVar, i3);
            oq5Var.k0(K);
        }
        return (ids) K;
    }

    public static final Object P(Function2 function2) {
        Thread.interrupted();
        return x97.D(g.a, new seg(function2, null));
    }

    public static final void Q(List list, eak eakVar) {
        Path path;
        int i;
        float f;
        int i2;
        ebk ebkVar;
        ebk ebkVar2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path2;
        float f10;
        float f11;
        float f12;
        List list2 = list;
        nh0 nh0Var = (nh0) eakVar;
        Path path3 = nh0Var.a;
        Path path4 = nh0Var.a;
        int i3 = path3.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        path4.rewind();
        nh0Var.i(i3);
        ebk ebkVar3 = list2.isEmpty() ? mak.c : (ebk) list2.get(0);
        int size = list2.size();
        float f13 = 0.0f;
        int i4 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i4 < size) {
            ebk ebkVar4 = (ebk) list2.get(i4);
            if (ebkVar4 instanceof mak) {
                nh0Var.b();
                path = path4;
                i = size;
                f = f13;
                i2 = i4;
                ebkVar2 = ebkVar4;
                f14 = f18;
                f16 = f14;
                f15 = f19;
                f17 = f15;
            } else {
                if (ebkVar4 instanceof yak) {
                    yak yakVar = (yak) ebkVar4;
                    float f20 = yakVar.c;
                    f16 += f20;
                    float f21 = yakVar.d;
                    f17 += f21;
                    path4.rMoveTo(f20, f21);
                    path = path4;
                    i = size;
                    f = f13;
                    i2 = i4;
                    f18 = f16;
                    f19 = f17;
                } else {
                    if (ebkVar4 instanceof qak) {
                        qak qakVar = (qak) ebkVar4;
                        float f22 = qakVar.c;
                        float f23 = qakVar.d;
                        nh0Var.f(f22, f23);
                        f17 = f23;
                        f19 = f17;
                        path = path4;
                        f16 = f22;
                        f18 = f16;
                    } else {
                        if (ebkVar4 instanceof xak) {
                            xak xakVar = (xak) ebkVar4;
                            float f24 = xakVar.d;
                            float f25 = xakVar.c;
                            path4.rLineTo(f25, f24);
                            f16 += f25;
                            f17 += f24;
                        } else if (ebkVar4 instanceof pak) {
                            pak pakVar = (pak) ebkVar4;
                            float f26 = pakVar.d;
                            float f27 = pakVar.c;
                            nh0Var.e(f27, f26);
                            f16 = f27;
                            path = path4;
                            f17 = f26;
                        } else if (ebkVar4 instanceof wak) {
                            float f28 = ((wak) ebkVar4).c;
                            path4.rLineTo(f28, f13);
                            f16 += f28;
                        } else if (ebkVar4 instanceof oak) {
                            float f29 = ((oak) ebkVar4).c;
                            nh0Var.e(f29, f17);
                            f16 = f29;
                        } else if (ebkVar4 instanceof cbk) {
                            float f30 = ((cbk) ebkVar4).c;
                            path4.rLineTo(f13, f30);
                            f17 += f30;
                        } else if (ebkVar4 instanceof dbk) {
                            float f31 = ((dbk) ebkVar4).c;
                            nh0Var.e(f16, f31);
                            f17 = f31;
                        } else {
                            if (ebkVar4 instanceof vak) {
                                vak vakVar = (vak) ebkVar4;
                                path4.rCubicTo(vakVar.c, vakVar.d, vakVar.e, vakVar.f, vakVar.g, vakVar.h);
                                path2 = path4;
                                f10 = vakVar.e + f16;
                                f11 = vakVar.f + f17;
                                f16 += vakVar.g;
                                f12 = vakVar.h;
                            } else {
                                Path path5 = path4;
                                if (ebkVar4 instanceof nak) {
                                    nak nakVar = (nak) ebkVar4;
                                    nh0Var.c(nakVar.c, nakVar.d, nakVar.e, nakVar.f, nakVar.g, nakVar.h);
                                    f4 = nakVar.e;
                                    f5 = nakVar.f;
                                    f6 = nakVar.g;
                                    f7 = nakVar.h;
                                } else if (ebkVar4 instanceof abk) {
                                    if (ebkVar3.a) {
                                        f8 = f16 - f14;
                                        f9 = f17 - f15;
                                    } else {
                                        f8 = f13;
                                        f9 = f8;
                                    }
                                    abk abkVar = (abk) ebkVar4;
                                    path5.rCubicTo(f8, f9, abkVar.c, abkVar.d, abkVar.e, abkVar.f);
                                    path2 = path5;
                                    f10 = abkVar.c + f16;
                                    f11 = abkVar.d + f17;
                                    f16 += abkVar.e;
                                    f12 = abkVar.f;
                                } else if (ebkVar4 instanceof sak) {
                                    if (ebkVar3.a) {
                                        float f32 = 2;
                                        f16 = (f16 * f32) - f14;
                                        f17 = (f32 * f17) - f15;
                                    }
                                    sak sakVar = (sak) ebkVar4;
                                    nh0Var.c(f16, f17, sakVar.c, sakVar.d, sakVar.e, sakVar.f);
                                    f4 = sakVar.c;
                                    f5 = sakVar.d;
                                    f6 = sakVar.e;
                                    f7 = sakVar.f;
                                } else {
                                    if (ebkVar4 instanceof zak) {
                                        zak zakVar = (zak) ebkVar4;
                                        float f33 = zakVar.f;
                                        float f34 = zakVar.e;
                                        float f35 = zakVar.d;
                                        float f36 = zakVar.c;
                                        path5.rQuadTo(f36, f35, f34, f33);
                                        float f37 = f36 + f16;
                                        f15 = f35 + f17;
                                        f16 += f34;
                                        f17 += f33;
                                        f14 = f37;
                                    } else if (ebkVar4 instanceof rak) {
                                        rak rakVar = (rak) ebkVar4;
                                        float f38 = rakVar.f;
                                        float f39 = rakVar.e;
                                        f15 = rakVar.d;
                                        float f40 = rakVar.c;
                                        path5.quadTo(f40, f15, f39, f38);
                                        f17 = f38;
                                        f16 = f39;
                                        path = path5;
                                        i = size;
                                        f = f13;
                                        i2 = i4;
                                        ebkVar2 = ebkVar4;
                                        f14 = f40;
                                    } else if (ebkVar4 instanceof bbk) {
                                        if (ebkVar3.b) {
                                            f2 = f16 - f14;
                                            f3 = f17 - f15;
                                        } else {
                                            f2 = f13;
                                            f3 = f2;
                                        }
                                        bbk bbkVar = (bbk) ebkVar4;
                                        float f41 = bbkVar.d;
                                        float f42 = bbkVar.c;
                                        path5.rQuadTo(f2, f3, f42, f41);
                                        float f43 = f2 + f16;
                                        float f44 = f3 + f17;
                                        f16 += f42;
                                        f17 += f41;
                                        f14 = f43;
                                        f15 = f44;
                                    } else if (ebkVar4 instanceof tak) {
                                        if (ebkVar3.b) {
                                            float f45 = 2;
                                            f16 = (f16 * f45) - f14;
                                            f17 = (f45 * f17) - f15;
                                        }
                                        tak takVar = (tak) ebkVar4;
                                        float f46 = takVar.d;
                                        float f47 = takVar.c;
                                        path5.quadTo(f16, f17, f47, f46);
                                        path = path5;
                                        i = size;
                                        f = f13;
                                        i2 = i4;
                                        f14 = f16;
                                        f15 = f17;
                                        ebkVar2 = ebkVar4;
                                        f16 = f47;
                                        f17 = f46;
                                    } else {
                                        if (ebkVar4 instanceof uak) {
                                            uak uakVar = (uak) ebkVar4;
                                            float f48 = uakVar.h + f16;
                                            float f49 = uakVar.i + f17;
                                            path = path5;
                                            i2 = i4;
                                            f = 0.0f;
                                            i = size;
                                            ebkVar = ebkVar4;
                                            nh0Var = nh0Var;
                                            x(nh0Var, f16, f17, f48, f49, uakVar.c, uakVar.d, uakVar.e, uakVar.f, uakVar.g);
                                            f14 = f48;
                                            f16 = f14;
                                            f15 = f49;
                                            f17 = f15;
                                        } else {
                                            path = path5;
                                            i = size;
                                            f = f13;
                                            i2 = i4;
                                            ebkVar = ebkVar4;
                                            if (ebkVar instanceof lak) {
                                                lak lakVar = (lak) ebkVar;
                                                float f50 = lakVar.i;
                                                float f51 = lakVar.h;
                                                ebkVar2 = ebkVar;
                                                nh0Var = nh0Var;
                                                x(nh0Var, f16, f17, f51, f50, lakVar.c, lakVar.d, lakVar.e, lakVar.f, lakVar.g);
                                                f15 = f50;
                                                f17 = f15;
                                                f14 = f51;
                                                f16 = f14;
                                            }
                                        }
                                        ebkVar2 = ebkVar;
                                    }
                                    path = path5;
                                }
                                f16 = f6;
                                f17 = f7;
                                path = path5;
                                i = size;
                                f = f13;
                                i2 = i4;
                                ebkVar2 = ebkVar4;
                                f14 = f4;
                                f15 = f5;
                            }
                            f17 += f12;
                            f15 = f11;
                            path = path2;
                            i = size;
                            f = f13;
                            i2 = i4;
                            ebkVar2 = ebkVar4;
                            f14 = f10;
                        }
                        path = path4;
                    }
                    i = size;
                    f = f13;
                    i2 = i4;
                }
                ebkVar2 = ebkVar4;
            }
            i4 = i2 + 1;
            list2 = list;
            path4 = path;
            size = i;
            ebkVar3 = ebkVar2;
            f13 = f;
        }
    }

    public static final kjm R(UserPreSaveDto userPreSaveDto) {
        Long millisecondsUntilRelease;
        Date date;
        List artists;
        WarningContent warningContent;
        ljm ljmVar;
        String id;
        String name;
        String id2 = userPreSaveDto.getId();
        if (id2 == null || (millisecondsUntilRelease = userPreSaveDto.getMillisecondsUntilRelease()) == null) {
            return null;
        }
        long longValue = millisecondsUntilRelease.longValue();
        qc7 releaseDate = userPreSaveDto.getReleaseDate();
        if (releaseDate == null || (date = releaseDate.b) == null || (artists = userPreSaveDto.getArtists()) == null) {
            return null;
        }
        List<PreSaveArtistDto> list = artists;
        ArrayList arrayList = new ArrayList();
        for (PreSaveArtistDto preSaveArtistDto : list) {
            if (preSaveArtistDto == null || (id = preSaveArtistDto.getId()) == null || (name = preSaveArtistDto.getName()) == null) {
                ljmVar = null;
            } else {
                String cover = preSaveArtistDto.getCover();
                WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                webPath$Storage.getClass();
                ljmVar = new ljm(id, name, etn.B(cover, webPath$Storage));
            }
            if (ljmVar != null) {
                arrayList.add(ljmVar);
            }
        }
        String coverUri = userPreSaveDto.getCoverUri();
        WebPath$Storage webPath$Storage2 = WebPath$Storage.AVATARS;
        webPath$Storage2.getClass();
        CoverPath B = etn.B(coverUri, webPath$Storage2);
        String title = userPreSaveDto.getTitle();
        String type = userPreSaveDto.getType();
        String contentWarning = userPreSaveDto.getContentWarning();
        if (contentWarning == null || (warningContent = WarningContent.a(contentWarning)) == null) {
            warningContent = WarningContent.NONE;
        }
        qc7 preSaveDate = userPreSaveDto.getPreSaveDate();
        Date date2 = preSaveDate != null ? preSaveDate.b : null;
        PreSaveContentRestrictionsDto contentRestrictions = userPreSaveDto.getContentRestrictions();
        return new kjm(arrayList, id2, date, longValue, B, title, type, warningContent, date2, true, contentRestrictions != null ? cb0.G(contentRestrictions) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [yiv] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ziv] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ajv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fhv S(WheelGetWheelResponseDto wheelGetWheelResponseDto) {
        String str;
        xiv xivVar;
        EntityCoverDto cover;
        String title;
        String id;
        String id2;
        String title2;
        o43 b0;
        EntityCoverDto cover2;
        u9b V;
        String color;
        Integer b02;
        xiv xivVar2;
        WheelItemDataDto$WheelItemDataWaveDto data;
        NewWaveModelDto wave;
        dou a2;
        AgentDto agent;
        np E;
        WheelItemDataDto$WheelItemDataAlbumDto data2;
        AlbumDomainItemDto album;
        lt J;
        List<ArtistDomainItemDto> artists;
        wheelGetWheelResponseDto.getClass();
        List items = wheelGetWheelResponseDto.getItems();
        if (items != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = items.iterator();
            while (true) {
                str = "";
                if (it.hasNext()) {
                    cjv cjvVar = (cjv) it.next();
                    if (cjvVar != null) {
                        if (cjvVar instanceof WheelItemDto$WheelItemAlbumDto) {
                            WheelItemDto$WheelItemAlbumDto wheelItemDto$WheelItemAlbumDto = (WheelItemDto$WheelItemAlbumDto) cjvVar;
                            String id3 = wheelItemDto$WheelItemAlbumDto.getId();
                            if (id3 != null && (data2 = wheelItemDto$WheelItemAlbumDto.getData()) != null && (album = data2.getAlbum()) != null && (J = xee.J(album)) != null && (artists = wheelItemDto$WheelItemAlbumDto.getData().getArtists()) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (ArtistDomainItemDto artistDomainItemDto : artists) {
                                    u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                                    if (K != null) {
                                        arrayList2.add(K);
                                    }
                                }
                                xivVar = new xiv(y1g.e0(wheelItemDto$WheelItemAlbumDto.getStyle()), id3, wheelItemDto$WheelItemAlbumDto.getDescription(), J, arrayList2);
                            }
                        } else if (cjvVar instanceof WheelItemDto$WheelItemWaveDto) {
                            WheelItemDto$WheelItemWaveDto wheelItemDto$WheelItemWaveDto = (WheelItemDto$WheelItemWaveDto) cjvVar;
                            String id4 = wheelItemDto$WheelItemWaveDto.getId();
                            if (id4 != null && (data = wheelItemDto$WheelItemWaveDto.getData()) != null && (wave = data.getWave()) != null && (a2 = wave.a()) != null && (agent = wheelItemDto$WheelItemWaveDto.getData().getAgent()) != null && (E = w1g.E(agent)) != null) {
                                xivVar2 = new ajv(y1g.e0(wheelItemDto$WheelItemWaveDto.getStyle()), id4, wheelItemDto$WheelItemWaveDto.getDescription(), new hlu(a2, E));
                                xivVar = xivVar2;
                            }
                        } else if (cjvVar instanceof WheelItemDto$WheelItemPromoDto) {
                            WheelItemDto$WheelItemPromoDto wheelItemDto$WheelItemPromoDto = (WheelItemDto$WheelItemPromoDto) cjvVar;
                            WheelItemDataDto$WheelItemDataPromoDto data3 = wheelItemDto$WheelItemPromoDto.getData();
                            if (data3 != null && (id = wheelItemDto$WheelItemPromoDto.getId()) != null && (id2 = data3.getId()) != null && (title2 = data3.getTitle()) != null) {
                                String description = data3.getDescription();
                                BlockActionDto action = data3.getAction();
                                if (action != null && (b0 = jf0.b0(action)) != null && (cover2 = data3.getCover()) != null && (V = c3x.V(cover2)) != null && (color = data3.getColor()) != null && (b02 = y2x.b0(color)) != null) {
                                    xivVar = new yiv(y1g.e0(wheelItemDto$WheelItemPromoDto.getStyle()), id, wheelItemDto$WheelItemPromoDto.getDescription(), id2, title2, description, b0, V, b02.intValue());
                                }
                            }
                        } else {
                            if (!(cjvVar instanceof WheelItemDto$WheelItemSettingsDto)) {
                                b6e.s();
                                return null;
                            }
                            WheelItemDto$WheelItemSettingsDto wheelItemDto$WheelItemSettingsDto = (WheelItemDto$WheelItemSettingsDto) cjvVar;
                            String id5 = wheelItemDto$WheelItemSettingsDto.getId();
                            if (id5 != null) {
                                WheelItemDataDto$WheelItemDataSettingsDto data4 = wheelItemDto$WheelItemSettingsDto.getData();
                                if (data4 != null && (title = data4.getTitle()) != null) {
                                    str = title;
                                }
                                WheelItemDataDto$WheelItemDataSettingsDto data5 = wheelItemDto$WheelItemSettingsDto.getData();
                                xivVar2 = new ziv(y1g.e0(wheelItemDto$WheelItemSettingsDto.getStyle()), id5, str, (data5 == null || (cover = data5.getCover()) == null) ? null : c3x.V(cover));
                                xivVar = xivVar2;
                            }
                        }
                        if (xivVar == null) {
                            arrayList.add(xivVar);
                        }
                    }
                    xivVar = null;
                    if (xivVar == null) {
                    }
                } else {
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        String wheelId = wheelGetWheelResponseDto.getWheelId();
                        return new fhv(wheelId != null ? wheelId : "", arrayList);
                    }
                }
            }
        }
        return null;
    }

    public static final void a(int i, hq5 hq5Var, yci yciVar, String str, String str2) {
        oq5 oq5Var;
        yci yciVar2;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1906269803);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(str2) ? 32 : 16) | 384;
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            vci vciVar = vci.a;
            yci o = a.o(androidx.compose.foundation.a.b(d.q(androidx.compose.ui.platform.a.a(vciVar, "video_clip_timer"), hag.E(32, 1, oq5Var2), hag.E(16, 1, oq5Var2), 0.0f, 0.0f, 12), kg5.r(R.color.bg_fade_day, oq5Var2), E(oq5Var2)), 4, 0.0f, 2);
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            yciVar2 = vciVar;
            xcs.b(str, ksw.D(vciVar, str2, null), kg5.r(R.color.text_primary_night, oq5Var2), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.h(), oq5Var2, i2 & 14, 0, 65528);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cw5(str, str2, yciVar2, i, 3);
        }
    }

    public static final void b(bci bciVar, pu0 pu0Var, n1h n1hVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        bciVar.getClass();
        n1hVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-809157059);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(pu0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(n1hVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            w1h w1hVar = (w1h) gld.M(n1hVar.d, oq5Var).getValue();
            if (Intrinsics.d(w1hVar, r1h.a)) {
                oq5Var.Z(-210843903);
                oq5Var.p(false);
            } else {
                if (!(w1hVar instanceof v1h)) {
                    throw vz1.i(oq5Var, -210846831, false);
                }
                oq5Var.Z(2053836407);
                jf0.a(new qzm[0], pu0Var, false, ild.C(-1304281852, new m1h(bciVar, (v1h) w1hVar, n1hVar, yciVar), oq5Var), oq5Var, i2 & 112, 4);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 19, bciVar, pu0Var, n1hVar, yciVar);
        }
    }

    public static final void c(bci bciVar, v1h v1hVar, n1h n1hVar, yci yciVar, hq5 hq5Var, int i) {
        bci bciVar2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1282950678);
        int i2 = (oq5Var.h(bciVar) ? 4 : 2) | i | (oq5Var.h(v1hVar) ? 32 : 16) | (oq5Var.h(n1hVar) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            bciVar2 = bciVar;
            yciVar2 = yciVar;
        } else {
            n1hVar.getClass();
            oq5Var.Z(214613894);
            nmj nmjVar = n1hVar.c;
            boolean h = oq5Var.h(n1hVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new ti1(6, n1hVar);
                oq5Var.k0(K);
            }
            jmj a2 = nmjVar.a((dmj) K, n1hVar.b, 2, oq5Var, 4544);
            oq5Var.p(false);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean z = v1hVar instanceof u1h;
            boolean h2 = oq5Var.h(v1hVar) | oq5Var.h(a2) | oq5Var.h(context);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new p3e(5, v1hVar, a2, context);
                oq5Var.k0(K2);
            }
            bciVar2 = bciVar;
            vq1.g(yciVar, bciVar2, z, (Function1) K2, oq5Var, ((i2 >> 9) & 14) | 64 | ((i2 << 3) & 112), 4);
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m1h(bciVar2, v1hVar, n1hVar, yciVar2, i);
        }
    }

    public static final void d(raj rajVar, wdj wdjVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        kjn kjnVar;
        Object m9jVar;
        wdj wdjVar2;
        wdjVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(254441642);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(rajVar) : oq5Var2.h(rajVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(wdjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            aqi Q = szf.Q(wdjVar.l(), oq5Var2);
            aqi Q2 = szf.Q(wdjVar.c(), oq5Var2);
            aqi Q3 = szf.Q(wdjVar.h(), oq5Var2);
            aqi Q4 = szf.Q(wdjVar.g(), oq5Var2);
            aqi P = szf.P(wdjVar.b(), j1g.b, null, oq5Var2, 48, 2);
            raj a2 = wdjVar.k() ? rajVar : raj.a(rajVar);
            rba rbaVar = (rba) Q.getValue();
            lzs lzsVar = (lzs) Q2.getValue();
            frs frsVar = (frs) Q3.getValue();
            cdj cdjVar = (cdj) Q4.getValue();
            boolean j = wdjVar.j();
            boolean h = oq5Var2.h(wdjVar);
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (h || K == kjnVar2) {
                kjnVar = kjnVar2;
                m9j m9jVar2 = new m9j(0, wdjVar, wdj.class, "onClick", "onClick()V", 0, 1);
                oq5Var2.k0(m9jVar2);
                K = m9jVar2;
            } else {
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var2.h(wdjVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                m9j m9jVar3 = new m9j(0, wdjVar, wdj.class, "onLongClick", "onLongClick()V", 0, 2);
                oq5Var2.k0(m9jVar3);
                K2 = m9jVar3;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var2.h(wdjVar);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                m9jVar = new m9j(0, wdjVar, wdj.class, "onOverflowClick", "onOverflowClick()V", 0, 3);
                wdjVar2 = wdjVar;
                oq5Var2.k0(m9jVar);
            } else {
                m9jVar = K3;
                wdjVar2 = wdjVar;
            }
            h9f h9fVar3 = (h9f) m9jVar;
            c0g R = rajVar.i ? a4g.R((j1g) P.getValue()) : c0g.a;
            Function0 function0 = (Function0) h9fVar;
            Function0 function02 = (Function0) h9fVar2;
            Function0 function03 = (Function0) h9fVar3;
            boolean h4 = oq5Var2.h(wdjVar2) | oq5Var2.f(P);
            Object K4 = oq5Var2.K();
            if (h4 || K4 == kjnVar) {
                K4 = new y6g(wdjVar2, P);
                oq5Var2.k0(K4);
            }
            oq5Var = oq5Var2;
            e(a2, rbaVar, lzsVar, frsVar, cdjVar, j, function0, function02, function03, yciVar, null, null, 0L, 0L, R, (Function0) K4, oq5Var, (i3 << 21) & 1879048192, 0, 15360);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(rajVar, wdjVar, yciVar, i, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final raj rajVar, final rba rbaVar, final lzs lzsVar, final frs frsVar, final cdj cdjVar, final boolean z, final Function0 function0, final Function0 function02, final Function0 function03, final yci yciVar, e9g e9gVar, ges gesVar, long j, long j2, c0g c0gVar, Function0 function04, hq5 hq5Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        ges gesVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        oq5 oq5Var;
        final c0g c0gVar2;
        final Function0 function05;
        final long j3;
        final ges gesVar3;
        final e9g e9gVar2;
        final long j4;
        xmn r;
        e9g e9gVar3;
        Function0 function06;
        c0g c0gVar3;
        q0k q0kVar;
        rajVar.getClass();
        rbaVar.getClass();
        lzsVar.getClass();
        frsVar.getClass();
        cdjVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(684934521);
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? oq5Var2.f(rajVar) : oq5Var2.h(rajVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= oq5Var2.d(rbaVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= oq5Var2.d(lzsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= oq5Var2.d(frsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= (i & SQLiteDatabase.OPEN_NOMUTEX) == 0 ? oq5Var2.f(cdjVar) : oq5Var2.h(cdjVar) ? 16384 : 8192;
        }
        int i14 = i & 196608;
        int i15 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i14 == 0) {
            i4 |= oq5Var2.g(z) ? 131072 : 65536;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i5 = 196608;
            i4 |= oq5Var2.h(function0) ? 1048576 : 524288;
        } else {
            i5 = 196608;
        }
        if ((i & 12582912) == 0) {
            i4 |= oq5Var2.h(function02) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i4 |= oq5Var2.h(function03) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= oq5Var2.f(yciVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i16 = i3 & 1024;
        if (i16 != 0) {
            i6 = 6;
        } else if ((i2 & 6) == 0) {
            i6 = i2 | (oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i3 & 2048) == 0) {
            gesVar2 = gesVar;
            if (oq5Var2.f(gesVar2)) {
                i7 = 32;
                long j5 = j;
                long j6 = j2;
                int i17 = i6 | i7 | (((i3 & 4096) == 0 || !oq5Var2.e(j5)) ? 128 : 256) | (((i3 & RemoteCameraConfig.Notification.ID) == 0 || !oq5Var2.e(j6)) ? 1024 : 2048);
                i8 = i3 & 16384;
                if (i8 == 0) {
                    i10 = i17 | 24576;
                    i9 = i8;
                } else {
                    i9 = i8;
                    i10 = i17 | (oq5Var2.d(c0gVar != null ? c0gVar.ordinal() : -1) ? 16384 : 8192);
                }
                i11 = i3 & SQLiteDatabase.OPEN_NOMUTEX;
                if (i11 == 0) {
                    i13 = i10 | i5;
                    i12 = i11;
                } else {
                    i12 = i11;
                    if (oq5Var2.h(function04)) {
                        i15 = 131072;
                    }
                    i13 = i10 | i15;
                }
                if (oq5Var2.P(i4 & 1, (i4 & 306783379) == 306783378 || (74899 & i13) != 74898)) {
                    oq5Var = oq5Var2;
                    oq5Var.S();
                    c0gVar2 = c0gVar;
                    function05 = function04;
                    j3 = j6;
                    gesVar3 = gesVar2;
                    e9gVar2 = e9gVar;
                    j4 = j5;
                } else {
                    oq5Var2.U();
                    if ((i & 1) == 0 || oq5Var2.y()) {
                        e9gVar3 = i16 != 0 ? e9g.b : e9gVar;
                        if ((i3 & 2048) != 0) {
                            i13 &= -113;
                            gesVar2 = nu0.j();
                        }
                        if ((i3 & 4096) != 0) {
                            j5 = ((dq0) oq5Var2.j(eq0.a)).a.c;
                            i13 &= -897;
                        }
                        if ((i3 & RemoteCameraConfig.Notification.ID) != 0) {
                            j6 = ((dq0) oq5Var2.j(eq0.a)).a.c;
                            i13 &= -7169;
                        }
                        c0g c0gVar4 = i9 != 0 ? c0g.a : c0gVar;
                        if (i12 != 0) {
                            Object K = oq5Var2.K();
                            if (K == gq5.a) {
                                K = new s9j(3);
                                oq5Var2.k0(K);
                            }
                            c0gVar3 = c0gVar4;
                            function06 = (Function0) K;
                        } else {
                            function06 = function04;
                            c0gVar3 = c0gVar4;
                        }
                    } else {
                        oq5Var2.S();
                        if ((i3 & 2048) != 0) {
                            i13 &= -113;
                        }
                        if ((i3 & 4096) != 0) {
                            i13 &= -897;
                        }
                        if ((i3 & RemoteCameraConfig.Notification.ID) != 0) {
                            i13 &= -7169;
                        }
                        e9gVar3 = e9gVar;
                        c0gVar3 = c0gVar;
                        function06 = function04;
                    }
                    long j7 = j5;
                    long j8 = j6;
                    oq5Var2.q();
                    boolean a2 = frsVar.a();
                    zyj b2 = frsVar.b();
                    nxq nxqVar = nxq.b;
                    if (e9gVar3 == e9g.a) {
                        q0kVar = a.c(0.0f, 0.0f, 16, 0.0f, 11);
                    } else {
                        float f = 0;
                        q0kVar = new q0k(f, f, f, f);
                    }
                    yci g = d.g(yciVar, 60, 0.0f, 2);
                    wn5 C = ild.C(14545151, new av5(rajVar, frsVar, e9gVar3, lzsVar, 23), oq5Var2);
                    ges gesVar4 = gesVar2;
                    s43 s43Var = new s43(gesVar4, rajVar, a2, cdjVar, 13);
                    int i18 = i13;
                    int i19 = (i4 & 112) | 905969664 | (i4 & 896) | ((i4 >> 6) & 7168);
                    int i20 = i4 >> 3;
                    int i21 = i19 | (458752 & i20) | (i20 & 3670016) | (i20 & 29360128);
                    int i22 = ((i18 >> 6) & 896) | 48 | ((i18 >> 3) & 57344);
                    int i23 = i18 << 12;
                    oq5Var = oq5Var2;
                    qgg.l(b2, rbaVar, lzsVar, z, a2, function0, function02, function03, C, ild.C(-124240256, s43Var, oq5Var2), g, nxqVar, c0gVar3, null, function06, null, j7, j8, q0kVar, null, false, oq5Var, i21, i22 | (i23 & 3670016) | (i23 & 29360128), 0, 1613824);
                    e9gVar2 = e9gVar3;
                    gesVar3 = gesVar4;
                    c0gVar2 = c0gVar3;
                    function05 = function06;
                    j4 = j7;
                    j3 = j8;
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new Function2() { // from class: qaj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int R = rvf.R(i | 1);
                            int R2 = rvf.R(i2);
                            o5g.e(raj.this, rbaVar, lzsVar, frsVar, cdjVar, z, function0, function02, function03, yciVar, e9gVar2, gesVar3, j4, j3, c0gVar2, function05, (hq5) obj, R, R2, i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            gesVar2 = gesVar;
        }
        i7 = 16;
        long j52 = j;
        long j62 = j2;
        int i172 = i6 | i7 | (((i3 & 4096) == 0 || !oq5Var2.e(j52)) ? 128 : 256) | (((i3 & RemoteCameraConfig.Notification.ID) == 0 || !oq5Var2.e(j62)) ? 1024 : 2048);
        i8 = i3 & 16384;
        if (i8 == 0) {
        }
        i11 = i3 & SQLiteDatabase.OPEN_NOMUTEX;
        if (i11 == 0) {
        }
        if (oq5Var2.P(i4 & 1, (i4 & 306783379) == 306783378 || (74899 & i13) != 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0079  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Function1 function1, Function0 function0, l6n l6nVar, yci yciVar, boolean z, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        boolean z2;
        yci yciVar3;
        boolean z3;
        oq5 oq5Var;
        xmn r;
        kjn kjnVar;
        vci vciVar;
        ?? r5;
        oq5 oq5Var2;
        function1.getClass();
        function0.getClass();
        l6nVar.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-219162538);
        int i4 = 16;
        int i5 = (oq5Var3.h(function1) ? 4 : 2) | i | (oq5Var3.h(function0) ? 32 : 16) | (oq5Var3.f(l6nVar) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i3 = i5 | (oq5Var3.f(yciVar2) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= oq5Var3.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if (oq5Var3.P(i3 & 1, (i3 & 9363) == 9362)) {
                oq5Var3.S();
                yciVar3 = yciVar2;
                z3 = z2;
                oq5Var = oq5Var3;
            } else {
                vci vciVar2 = vci.a;
                yciVar3 = i6 != 0 ? vciVar2 : yciVar2;
                boolean z4 = i7 != 0 ? false : z2;
                yci d = d.d(yciVar3, 1.0f);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                int i8 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, a2, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var3, i8, kb5Var);
                }
                g0g.U(oq5Var3, H, wp5.d);
                kjn kjnVar2 = gq5.a;
                if (z4) {
                    oq5Var3.Z(-827074761);
                    yci m = a.m(d.d(vciVar2, 1.0f), 16);
                    Object K = oq5Var3.K();
                    if (K == kjnVar2) {
                        K = new gkm(i4);
                        oq5Var3.k0(K);
                    }
                    vciVar = vciVar2;
                    kjnVar = kjnVar2;
                    r5 = 0;
                    xcs.b(rvf.M(R.string.quality_settings_bottom_sheet_title, oq5Var3), nfp.b(m, false, (Function1) K), ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.c(), oq5Var3, 0, 0, 65016);
                    oq5Var2 = oq5Var3;
                } else {
                    kjnVar = kjnVar2;
                    vciVar = vciVar2;
                    r5 = 0;
                    oq5Var3.Z(-828667262);
                    oq5Var2 = oq5Var3;
                }
                oq5Var2.p(r5);
                a4g.g(function1, l6nVar, null, oq5Var2, ((i3 >> 3) & 112) | (i3 & 14));
                float f = 16;
                vci vciVar3 = vciVar;
                yci q = a.q(vciVar3, f, 0.0f, f, 0.0f, 10);
                agr agrVar = eq0.a;
                xv7.k(q, ((dq0) oq5Var2.j(agrVar)).c.c, 0.0f, 0.0f, oq5Var2, 6, 12);
                yci p = a.p(androidx.compose.foundation.a.e(d.d(vciVar3, 1.0f), false, null, new meo(r5), function0, 3), f, f, f, 36);
                Object K2 = oq5Var2.K();
                if (K2 == kjnVar) {
                    K2 = new gkm(17);
                    oq5Var2.k0(K2);
                }
                oq5 oq5Var4 = oq5Var2;
                xcs.b(rvf.M(R.string.quality_settings_explanation_info_button, oq5Var2), nfp.b(p, r5, (Function1) K2), ((dq0) oq5Var2.j(agrVar)).b.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var4, 0, 0, 65528);
                oq5 oq5Var5 = oq5Var4;
                oq5Var5.p(true);
                z3 = z4;
                oq5Var = oq5Var5;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new p91(function1, function0, l6nVar, yciVar3, z3, i, i2, 3);
                return;
            }
            return;
        }
        z2 = z;
        if (oq5Var3.P(i3 & 1, (i3 & 9363) == 9362)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(c0p c0pVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        int i3;
        int i4;
        String n;
        String str;
        Object K;
        int i5;
        c0pVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(57179067);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.d(c0pVar.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (oq5Var.P(i6 & 1, (i6 & 19) != 18)) {
            int i7 = o2p.a[c0pVar.ordinal()] == 1 ? R.string.context_search_title_concerts : R.string.search_history;
            int ordinal = c0pVar.ordinal();
            if (ordinal == 0) {
                i3 = -885479715;
                i4 = R.string.context_search_subtitile_kids;
            } else if (ordinal == 1) {
                i3 = -885476479;
                i4 = R.string.context_search_subtitile_podcasts;
            } else if (ordinal == 2) {
                i3 = -885473151;
                i4 = R.string.context_search_subtitile_my_music;
            } else if (ordinal == 3) {
                i3 = -885469887;
                i4 = R.string.context_search_subtitle_all_music;
            } else {
                if (ordinal != 4) {
                    throw vz1.i(oq5Var, -885481002, false);
                }
                oq5Var.Z(-1679660606);
                oq5Var.p(false);
                n = null;
                str = n;
                gz2 gz2Var = b2c.o;
                vci vciVar = vci.a;
                yci q = a.q(d.d(vciVar, 1.0f), 0.0f, 12, 0.0f, 16, 5);
                K = oq5Var.K();
                if (K == gq5.a) {
                    K = new d0p(7);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(q, true, (Function1) K);
                ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, b2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                xcs.b(rvf.M(i7, oq5Var), androidx.compose.ui.platform.a.a(vciVar, "search_history_title"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 2, 0, null, nu0.c(), oq5Var, 48, 3072, 56828);
                oq5Var = oq5Var;
                if (str != null) {
                    oq5Var.Z(-1040014367);
                } else {
                    oq5Var.Z(-1040014366);
                    xcs.b(str, androidx.compose.ui.platform.a.a(vciVar, "search_history_subtitle"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.c(), oq5Var, 48, 3072, 57340);
                    oq5Var = oq5Var;
                }
                oq5Var.p(false);
                oq5Var.p(true);
                yciVar2 = vciVar;
            }
            n = vz1.n(oq5Var, i3, i4, oq5Var, false);
            str = n;
            gz2 gz2Var2 = b2c.o;
            vci vciVar2 = vci.a;
            yci q2 = a.q(d.d(vciVar2, 1.0f), 0.0f, 12, 0.0f, 16, 5);
            K = oq5Var.K();
            if (K == gq5.a) {
            }
            yci b22 = nfp.b(q2, true, (Function1) K);
            ta5 a22 = sa5.a(qx0.c, gz2Var2, oq5Var, 48);
            i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a22, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var2);
            g0g.U(oq5Var, H2, wp5.d);
            xcs.b(rvf.M(i7, oq5Var), androidx.compose.ui.platform.a.a(vciVar2, "search_history_title"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 2, 0, null, nu0.c(), oq5Var, 48, 3072, 56828);
            oq5Var = oq5Var;
            if (str != null) {
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar2 = vciVar2;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(c0pVar, yciVar2, i, 11);
        }
    }

    public static final void h(n5r n5rVar, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(904164128);
        int i2 = (oq5Var.f(n5rVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            bg3.a(a.d(d.d(vci.a, 1.0f), 1.25f), null, false, ild.C(1827575030, new o91(n5rVar, z, 7), oq5Var), oq5Var, 3078, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl3(n5rVar, z, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005e  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(z9u z9uVar, yci yciVar, uoi uoiVar, hq5 hq5Var, int i, int i2) {
        int i3;
        uoi uoiVar2;
        uoi uoiVar3;
        oq5 oq5Var;
        xmn r;
        kb5 kb5Var;
        uoi uoiVar4;
        kb5 kb5Var2;
        kb5 kb5Var3;
        vci vciVar;
        kb5 kb5Var4;
        grb grbVar;
        ?? r3;
        oq5 oq5Var2;
        boolean z;
        boolean z2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1361732290);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var3.f(z9uVar) : oq5Var3.h(z9uVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var3.f(yciVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            uoiVar2 = uoiVar;
            i3 |= oq5Var3.f(uoiVar2) ? 256 : 128;
            if (oq5Var3.P(i3 & 1, (i3 & 147) == 146)) {
                oq5 oq5Var4 = oq5Var3;
                oq5Var4.S();
                uoiVar3 = uoiVar2;
                oq5Var = oq5Var4;
            } else {
                if (i4 != 0) {
                    uoiVar2 = null;
                }
                yci u = xp3.u(a.d(yciVar, 1.7727273f), E(oq5Var3));
                kfh d = ug3.d(b2c.b, false);
                int i5 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, u);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar2);
                } else {
                    oq5Var3.n0();
                }
                kb5 kb5Var5 = wp5.f;
                g0g.U(oq5Var3, d, kb5Var5);
                kb5 kb5Var6 = wp5.e;
                g0g.U(oq5Var3, l, kb5Var6);
                kb5 kb5Var7 = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var3, i5, kb5Var7);
                }
                kb5 kb5Var8 = wp5.d;
                g0g.U(oq5Var3, H, kb5Var8);
                boolean booleanValue = ((Boolean) oq5Var3.j(koe.a)).booleanValue();
                vci vciVar2 = vci.a;
                if (booleanValue) {
                    oq5Var3.Z(-1570713304);
                    qo6 qo6Var = qo6.j;
                    gce gceVar = gce.d;
                    Object K = oq5Var3.K();
                    if (K == gq5.a) {
                        K = new d4u(8);
                        oq5Var3.k0(K);
                    }
                    yci c = androidx.compose.ui.draw.a.c(vciVar2, (Function1) K);
                    oq5 oq5Var5 = oq5Var3;
                    uoiVar4 = uoiVar2;
                    r3 = 0;
                    kb5Var2 = kb5Var6;
                    grbVar = grbVar2;
                    kb5Var3 = kb5Var8;
                    kb5Var = kb5Var5;
                    kb5Var4 = kb5Var7;
                    vciVar = vciVar2;
                    swf.d(qo6Var, gceVar, c, null, 0L, 0L, false, oq5Var5, 54, 120);
                    oq5Var5.p(false);
                    oq5Var2 = oq5Var5;
                } else {
                    kb5Var = kb5Var5;
                    uoiVar4 = uoiVar2;
                    kb5Var2 = kb5Var6;
                    kb5Var3 = kb5Var8;
                    vciVar = vciVar2;
                    kb5Var4 = kb5Var7;
                    grbVar = grbVar2;
                    r3 = 0;
                    oq5 oq5Var6 = oq5Var3;
                    oq5Var6.Z(-1570462607);
                    String str = z9uVar.d;
                    oq5Var6.Z(1196269570);
                    yci a2 = uoiVar4 == null ? vciVar : e.a(vciVar, uoiVar4, (yie) oq5Var6.j(e.a));
                    oq5Var6.p(false);
                    n(0, oq5Var6, a2, str);
                    oq5Var6.p(false);
                    oq5Var2 = oq5Var6;
                }
                yci m = a.m(d.d(b.a.a(vciVar, b2c.j), 1.0f), 4);
                nho a3 = lho.a(qx0.g, b2c.k, oq5Var2, 6);
                int i6 = oq5Var2.P;
                androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                yci H2 = vnj.H(oq5Var2, m);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a3, kb5Var);
                g0g.U(oq5Var2, l2, kb5Var2);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var2, i6, kb5Var4);
                }
                g0g.U(oq5Var2, H2, kb5Var3);
                jzb jzbVar = z9uVar.h;
                if (jzbVar != null) {
                    oq5Var2.Z(1923303140);
                    z = true;
                    z2 = !ksw.F(oq5Var2);
                    oq5Var2.p(r3);
                } else {
                    z = true;
                    oq5Var2.Z(-507143567);
                    oq5Var2.p(r3);
                    z2 = r3;
                }
                if (z2) {
                    oq5Var2.Z(-507087638);
                    lg3.q(jzbVar, androidx.compose.ui.platform.a.a(d.m(a.q(vciVar, 2, 0.0f, 0.0f, 0.0f, 14), 16), "video_clip_explicit"), kg5.r(R.color.icon_primary_night, oq5Var2), oq5Var2, 48, 0);
                    oq5Var2.p(r3);
                } else {
                    oq5Var2.Z(-506742484);
                    u1g.l(oq5Var2, d.z(vciVar, 3));
                    oq5Var2.p(r3);
                }
                a(r3, oq5Var2, null, z9uVar.g, z9uVar.j);
                oq5Var2.p(z);
                oq5Var2.p(z);
                uoiVar3 = uoiVar4;
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new o4p(i, i2, 13, yciVar, z9uVar, uoiVar3);
                return;
            }
            return;
        }
        uoiVar2 = uoiVar;
        if (oq5Var3.P(i3 & 1, (i3 & 147) == 146)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(z9u z9uVar, Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        xmn r;
        z9uVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-283157785);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(z9uVar) : oq5Var.h(z9uVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if (oq5Var.P(i3 & 1, (i3 & 147) == 146)) {
                oq5Var.S();
            } else {
                vci vciVar = vci.a;
                yci yciVar3 = i4 != 0 ? vciVar : yciVar2;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = vz1.h(oq5Var);
                }
                uoi uoiVar = (uoi) K;
                yci b2 = com.yandex.music.core.ui.compose.b.b(androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.d(yciVar3, uoiVar, null, false, null, null, function0, 28), "video_clip"), z9uVar.a);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, b2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                int i6 = i3 & 14;
                i(z9uVar, f8g.g0(vciVar, 1.0f), uoiVar, oq5Var, 432 | i6, 0);
                u1g.l(oq5Var, d.e(vciVar, 8));
                o(z9uVar, f8g.g0(vciVar, 0.0f), oq5Var, 48 | i6);
                oq5Var.p(true);
                yciVar2 = yciVar3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new o4p(z9uVar, function0, yciVar2, i, i2, 12);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i3 & 1, (i3 & 147) == 146)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void k(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1970903127);
        int i2 = i | 6;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            ivf.k(6, 0, oq5Var, xp3.u(a.d(vciVar, 1.7727273f), E(oq5Var)), true);
            u1g.l(oq5Var, d.e(vciVar, 8));
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            ivf.l(true, d.r(vciVar, 82), nu0.j(), oq5Var, 54, 0);
            u1g.l(oq5Var, d.e(vciVar, 2));
            ivf.l(true, d.r(vciVar, 120), nu0.i(), oq5Var, 54, 0);
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 21);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11.K(), java.lang.Integer.valueOf(r3)) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(z9u z9uVar, Function0 function0, Function0 function02, yci yciVar, Function0 function03, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        oq5 oq5Var;
        Function0 function04;
        int i4;
        Function0 function05;
        kb5 kb5Var;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(547190649);
        int i5 = (oq5Var2.f(z9uVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= oq5Var2.h(function02) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i3 = i5 | (oq5Var2.f(yciVar2) ? 2048 : 1024);
        }
        int i7 = i3 | RemoteCameraConfig.Notification.ID;
        if (oq5Var2.P(i7 & 1, (i7 & 9363) != 9362)) {
            oq5Var2.U();
            int i8 = i & 1;
            vci vciVar = vci.a;
            if (i8 == 0 || oq5Var2.y()) {
                if (i6 != 0) {
                    yciVar2 = vciVar;
                }
                i4 = i7 & (-57345);
                function05 = function02;
            } else {
                oq5Var2.S();
                i4 = i7 & (-57345);
                function05 = function03;
            }
            int i9 = i4;
            yci yciVar3 = yciVar2;
            oq5Var2.q();
            float f = 16;
            float f2 = 8;
            yci p = a.p(androidx.compose.foundation.a.j(d.d(yciVar3, 1.0f), null, irf.S(function05, oq5Var2, 0), function0, 111), f, f2, f, f2);
            p.getClass();
            yci b2 = com.yandex.music.core.ui.compose.b.b(androidx.compose.ui.platform.a.a(p.f(new tbf(function02, lhb.v0, new f0g(5, function02))), "video_clip"), z9uVar.a);
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var2, 0);
            int i10 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var2.O) {
                kb5Var = kb5Var3;
            } else {
                kb5Var = kb5Var3;
            }
            ouj.x(i10, oq5Var2, i10, kb5Var4);
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var5);
            int i11 = i9 & 14;
            int i12 = 48 | i11;
            kb5 kb5Var6 = kb5Var;
            oq5Var = oq5Var2;
            float f3 = 1.0f;
            i(z9uVar, f8g.g0(d.r(vciVar, 156), 1.0f), null, oq5Var, i12, 4);
            u1g.l(oq5Var, d.r(vciVar, 12));
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, f3);
            hz2 hz2Var = b2c.l;
            o(z9uVar, f8g.g0(layoutWeightElement.f(new VerticalAlignElement(hz2Var)), 0.0f), oq5Var, i11);
            u1g.l(oq5Var, d.r(vciVar, f2));
            yci m = d.m(new VerticalAlignElement(hz2Var), 40);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new d4u(9);
                oq5Var.k0(K);
            }
            yci a3 = nfp.a(m, (Function1) K);
            kfh d = ug3.d(b2c.b, false);
            int i13 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var6);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i13))) {
                ouj.x(i13, oq5Var, i13, kb5Var4);
            }
            g0g.U(oq5Var, H2, kb5Var5);
            yciVar2 = yciVar3;
            aae.a(function02, null, false, sk3.e, oq5Var, ((i9 >> 6) & 14) | 24576, 14);
            oq5Var.p(true);
            oq5Var.p(true);
            function04 = function05;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            function04 = function03;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cj(z9uVar, function0, function02, yciVar2, function04, i, i2);
        }
    }

    public static final void m(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1059937518);
        if (oq5Var.P(i & 1, i != 0)) {
            hz2 hz2Var = b2c.l;
            vci vciVar = vci.a;
            float f = 16;
            float f2 = 8;
            yci p = a.p(d.d(vciVar, 1.0f), f, f2, f, f2);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            ivf.k(6, 0, oq5Var, xp3.u(d.e(d.r(vciVar, 156), 88), E(oq5Var)), true);
            yci q = a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci g = vz1.g(1.0f, q, true);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, g);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            ivf.l(true, d.r(vciVar, 82), nu0.j(), oq5Var, 54, 0);
            u1g.l(oq5Var, d.e(vciVar, 2));
            ivf.l(true, d.r(vciVar, 120), nu0.i(), oq5Var, 54, 0);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j1p(i, 21);
        }
    }

    public static final void n(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(309030031);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            w1g.j(str, null, yciVar, null, null, null, null, 0.0f, null, 0, sk3.f, oq5Var, (i2 & 14) | 48 | ((i2 << 3) & 896), 1016);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 14);
        }
    }

    public static final void o(z9u z9uVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        float f;
        vci vciVar;
        z9u z9uVar2 = z9uVar;
        z9uVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-146224894);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? oq5Var.f(z9uVar2) : oq5Var.h(z9uVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            float f2 = 2;
            yci e = d.e(yciVar, w1g.p(nu0.i(), 0, oq5Var, 0, 2) + w1g.p(nu0.j(), 0, oq5Var, 0, 2) + f2);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean F = ksw.F(oq5Var);
            vci vciVar2 = vci.a;
            if (F) {
                oq5Var.Z(1554118732);
                jzb jzbVar = z9uVar2.h;
                bg3.a(null, null, false, ild.C(-866673349, new o4u(z9uVar2, ox6.E(jzbVar, ((dq0) oq5Var.j(eq0.a)).b.a, oq5Var, 2), jzbVar != null, 0), oq5Var), oq5Var, 3072, 7);
                oq5Var.p(false);
                f = f2;
                vciVar = vciVar2;
            } else {
                oq5Var.Z(1555080848);
                f = f2;
                vciVar = vciVar2;
                xv7.j(z9uVar2.e, androidx.compose.ui.platform.a.a(vciVar2, "video_clip_title"), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            u1g.l(oq5Var, d.e(vciVar, f));
            z9uVar2 = z9uVar;
            oq5 oq5Var2 = oq5Var;
            xv7.j(z9uVar2.f, androidx.compose.ui.platform.a.a(vciVar, "video_clip_subtitle"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var2, 48, 3120, 55288);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(z9uVar2, yciVar, i, 26);
        }
    }

    public static void p(n9b n9bVar, lnu lnuVar, pwu pwuVar) {
        float f = 16;
        yci p = a.p(vci.a, f, 24, f, 8);
        n9bVar.getClass();
        lnuVar.getClass();
        p.getClass();
        n9bVar.a.a(new wn5(new kws(p, lnuVar, pwuVar), -509473917, true));
    }

    public static final void q(rmu rmuVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        long j;
        rmuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-814235947);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(rmuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = vci.a;
            zmu zmuVar = (zmu) gld.M(rmuVar.d, oq5Var).getValue();
            yci o = a.o(d.d(yciVar2, 1.0f), v0k.b, 0.0f, 2);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            b bVar = b.a;
            if (Intrinsics.d(zmuVar, xmu.a)) {
                oq5Var.Z(1758253147);
                e9q.i(54, 4, oq5Var, null, true, true);
                oq5Var.p(false);
            } else if (zmuVar instanceof ymu) {
                oq5Var.Z(1758497551);
                ymu ymuVar = (ymu) zmuVar;
                d85 d85Var = ymuVar.d;
                d85 d85Var2 = d85Var != null ? new d85(jf0.c0(d85Var.a)) : null;
                if (d85Var2 == null) {
                    oq5Var.Z(-358913994);
                    j = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-358916257);
                    oq5Var.p(false);
                    j = d85Var2.a;
                }
                lnu lnuVar = new lnu(ymuVar.b, rvf.M(R.string.dialog_action_radio_track, oq5Var), ((dq0) oq5Var.j(eq0.a)).c.c, new amu(ymuVar.c, null, null), null, null, new d85(j), null, 176);
                rr5 rr5Var = ymuVar.a;
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                }
                mm6 mm6Var = ((fs5) K).a;
                boolean f = oq5Var.f(rr5Var) | oq5Var.f(mm6Var);
                Object K2 = oq5Var.K();
                if (f || K2 == kjnVar) {
                    knn knnVar = rmuVar.b;
                    qnq qnqVar = rmuVar.a;
                    hn5 hn5Var = qnqVar.b;
                    kxi kxiVar = qnqVar.d;
                    xes xesVar = new xes(13, rmuVar, rr5Var);
                    hn5Var.getClass();
                    kxiVar.getClass();
                    ((jtb) ((zl) knnVar.b).b).getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(k6l.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    k6l k6lVar = (k6l) qdcVar.C(I);
                    bdt I2 = hag.I(uwu.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    uwu uwuVar = (uwu) qdcVar2.C(I2);
                    bdt I3 = hag.I(zy7.class);
                    qdc qdcVar3 = l18Var.a;
                    qdcVar3.getClass();
                    swu swuVar = new swu(rr5Var, kxiVar, xesVar, k6lVar, uwuVar, (zy7) qdcVar3.C(I3), null, mm6Var);
                    oq5Var.k0(swuVar);
                    K2 = swuVar;
                }
                owu owuVar = (owu) K2;
                yci a2 = bVar.a(yciVar2, b2c.f);
                ynn i4 = irv.i(oq5Var);
                qkl qklVar = ymuVar.e;
                boolean h = oq5Var.h(rmuVar);
                Object K3 = oq5Var.K();
                if (h || K3 == kjnVar) {
                    K3 = new olu(1, rmuVar);
                    oq5Var.k0(K3);
                }
                e9q.a(lnuVar, owuVar, com.yandex.music.core.ui.compose.a.c(a2, i4, qklVar, (pyc) K3, 14), 0.0f, oq5Var, 0, 8);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(zmuVar, wmu.a)) {
                    throw vz1.i(oq5Var, -358924759, false);
                }
                oq5Var.Z(-358872813);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(rmuVar, yciVar2, i, 28);
        }
    }

    public static final Pair r(int i, int i2, int i3) {
        int i4 = i3 / 2;
        int i5 = i2 - i4;
        if (i5 + i3 < i) {
            if (i5 < 0) {
                i5 = 0;
            }
            return new Pair(Integer.valueOf(i5), Integer.valueOf(i3 + i5));
        }
        int i6 = i2 + i4 + 1;
        if (i6 <= i) {
            i = i6;
        }
        return new Pair(Integer.valueOf(i - i3), Integer.valueOf(i));
    }

    public static float s(float f, float f2, float f3, float f4, int i, int i2, float f5, float f6, hq5 hq5Var, int i3) {
        return t(f, f2, f3, f4, i, i2, (i3 & 64) != 0 ? Float.NaN : f5, f6, (jx7) ((oq5) hq5Var).j(es5.h));
    }

    public static float t(float f, float f2, float f3, float f4, int i, int i2, float f5, float f6, jx7 jx7Var) {
        float f7;
        jx7Var.getClass();
        float f8 = vt0.f;
        if (Float.compare(f, f8) < 0) {
            float f9 = i;
            f7 = (((f - f2) - f6) - (f3 * f9)) / f9;
        } else {
            float f10 = ((((int) ((f - f8) / f4)) + 2) + i) - 1;
            f7 = (((f - f2) - f6) - (f3 * f10)) / f10;
        }
        float f11 = f - f2;
        float f12 = i2;
        if (Float.compare((f11 - (f7 * f12)) - (f3 * f12), 0) >= 0) {
            float d0 = jx7Var.d0(jx7Var.n0(((f - (f2 * 2)) - ((i2 - 1) * f3)) / f12) - 1);
            if (Float.compare(d0 - f7, f6 / f12) <= 0) {
                f7 = d0;
            }
        }
        if (cma.a(f5, Float.NaN)) {
            return f7;
        }
        cma cmaVar = new cma(f5);
        cma cmaVar2 = new cma((f11 - f3) - f6);
        if (cmaVar.compareTo(cmaVar2) > 0) {
            cmaVar = cmaVar2;
        }
        return ((cma) yhn.a(new cma(f7), new cma(cmaVar.a))).a;
    }

    public static void u(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.x(str);
    }

    public static void v(int i) {
        if (i >= 0) {
            return;
        }
        e7o.e();
    }

    public static void w(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static final void x(eak eakVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            x(eakVar, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d16 * sqrt2;
        double d24 = sqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        double d29 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = atan22;
        double d31 = -d10;
        double d32 = d31 * cos2;
        double d33 = d6 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        double d36 = d6 * cos2;
        double d37 = (cos3 * d36) + (sin3 * d35);
        double d38 = d30 / ceil;
        double d39 = atan2;
        double d40 = d34;
        int i = 0;
        double d41 = d;
        double d42 = d37;
        double d43 = d2;
        while (i < ceil) {
            double d44 = d39 + d38;
            double sin4 = Math.sin(d44);
            double cos4 = Math.cos(d44);
            int i2 = i;
            double d45 = (((d10 * cos2) * cos4) + d27) - (d33 * sin4);
            int i3 = ceil;
            double d46 = (d36 * sin4) + (d10 * sin2 * cos4) + d28;
            double d47 = (d32 * sin4) - (d33 * cos4);
            double d48 = (cos4 * d36) + (sin4 * d35);
            double d49 = d44 - d39;
            double tan = Math.tan(d49 / d18);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - 1) * Math.sin(d49)) / 3;
            ((nh0) eakVar).c((float) ((d40 * sqrt3) + d41), (float) ((d42 * sqrt3) + d43), (float) (d45 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d45, (float) d46);
            sin2 = sin2;
            d41 = d45;
            i = i2 + 1;
            d27 = d27;
            d29 = d29;
            d39 = d44;
            d42 = d48;
            d40 = d47;
            d43 = d46;
            ceil = i3;
            d10 = d5;
        }
    }

    public static final Object y(tgm tgmVar, String str, cg6 cg6Var) {
        Object b2 = tgmVar.b(str, new h4t(12), cg6Var);
        return b2 == nm6.a ? b2 : Unit.a;
    }

    public static final ukd z(ukd ukdVar) {
        return A(ukdVar).d(new bxd(p38.a));
    }

    public abstract List B();
}
