package com.yandex.music.screen.landing.header.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import defpackage.c3x;
import defpackage.frv;
import defpackage.hfs;
import defpackage.ifs;
import defpackage.jcv;
import defpackage.jf0;
import defpackage.p5r;
import defpackage.q5r;
import defpackage.r5r;
import defpackage.s5r;
import defpackage.t5r;
import defpackage.u5r;
import defpackage.wct;
import defpackage.y2x;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.music.data.stores.WebPath$Storage;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/music/screen/landing/header/data/SpecialHeaderBlockDto;", "", "", "title", "Lcom/yandex/music/screen/landing/header/data/ThemedSpecialHeaderDto;", "lightTheme", "darkTheme", "Lcom/yandex/music/screen/landing/header/data/SpecialHeaderButtonDto;", "button", "Lcom/yandex/music/screen/landing/header/data/SpecialHeaderDoodleDto;", "doodle", "<init>", "(Ljava/lang/String;Lcom/yandex/music/screen/landing/header/data/ThemedSpecialHeaderDto;Lcom/yandex/music/screen/landing/header/data/ThemedSpecialHeaderDto;Lcom/yandex/music/screen/landing/header/data/SpecialHeaderButtonDto;Lcom/yandex/music/screen/landing/header/data/SpecialHeaderDoodleDto;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/yandex/music/screen/landing/header/data/ThemedSpecialHeaderDto;", "getLightTheme", "()Lcom/yandex/music/screen/landing/header/data/ThemedSpecialHeaderDto;", "getDarkTheme", "Lcom/yandex/music/screen/landing/header/data/SpecialHeaderButtonDto;", "getButton", "()Lcom/yandex/music/screen/landing/header/data/SpecialHeaderButtonDto;", "Lcom/yandex/music/screen/landing/header/data/SpecialHeaderDoodleDto;", "getDoodle", "()Lcom/yandex/music/screen/landing/header/data/SpecialHeaderDoodleDto;", "landing-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class SpecialHeaderBlockDto {

    @SerializedName("button")
    private final SpecialHeaderButtonDto button;

    @SerializedName("darkTheme")
    private final ThemedSpecialHeaderDto darkTheme;

    @SerializedName("doodle")
    private final SpecialHeaderDoodleDto doodle;

    @SerializedName("lightTheme")
    private final ThemedSpecialHeaderDto lightTheme;

    @SerializedName("title")
    private final String title;

    public SpecialHeaderBlockDto(String str, ThemedSpecialHeaderDto themedSpecialHeaderDto, ThemedSpecialHeaderDto themedSpecialHeaderDto2, SpecialHeaderButtonDto specialHeaderButtonDto, SpecialHeaderDoodleDto specialHeaderDoodleDto) {
        this.title = str;
        this.lightTheme = themedSpecialHeaderDto;
        this.darkTheme = themedSpecialHeaderDto2;
        this.button = specialHeaderButtonDto;
        this.doodle = specialHeaderDoodleDto;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u5r a() {
        p5r p5rVar;
        t5r t5rVar;
        s5r r5rVar;
        BlockActionDto action;
        BlockActionDto action2;
        ThemedSpecialHeaderDto themedSpecialHeaderDto;
        Pair pair;
        String animationUrl;
        String animationUrl2;
        BlockActionDto action3;
        String titleColor;
        String titleColor2;
        String titleColor3;
        String titleColor4;
        String buttonTitleColor;
        String buttonTitleColor2;
        String buttonColor;
        String buttonColor2;
        BlockActionDto actions;
        SpecialHeaderButtonDto specialHeaderButtonDto = this.button;
        ifs ifsVar = null;
        String deeplink = (specialHeaderButtonDto == null || (actions = specialHeaderButtonDto.getActions()) == null) ? null : actions.getDeeplink();
        ThemedSpecialHeaderDto themedSpecialHeaderDto2 = this.darkTheme;
        Integer b0 = (themedSpecialHeaderDto2 == null || (buttonColor2 = themedSpecialHeaderDto2.getButtonColor()) == null) ? null : y2x.b0(buttonColor2);
        ThemedSpecialHeaderDto themedSpecialHeaderDto3 = this.lightTheme;
        Integer b02 = (themedSpecialHeaderDto3 == null || (buttonColor = themedSpecialHeaderDto3.getButtonColor()) == null) ? null : y2x.b0(buttonColor);
        ThemedSpecialHeaderDto themedSpecialHeaderDto4 = this.darkTheme;
        Integer b03 = (themedSpecialHeaderDto4 == null || (buttonTitleColor2 = themedSpecialHeaderDto4.getButtonTitleColor()) == null) ? null : y2x.b0(buttonTitleColor2);
        ThemedSpecialHeaderDto themedSpecialHeaderDto5 = this.lightTheme;
        Integer b04 = (themedSpecialHeaderDto5 == null || (buttonTitleColor = themedSpecialHeaderDto5.getButtonTitleColor()) == null) ? null : y2x.b0(buttonTitleColor);
        SpecialHeaderButtonDto specialHeaderButtonDto2 = this.button;
        if ((specialHeaderButtonDto2 != null ? specialHeaderButtonDto2.getTitle() : null) == null || deeplink == null || b0 == null || b02 == null) {
            p5rVar = null;
        } else {
            p5rVar = new p5r(new hfs(c3x.f(b0.intValue()), c3x.f(b02.intValue())), (b03 == null || b04 == null) ? null : new hfs(c3x.f(b03.intValue()), c3x.f(b04.intValue())), this.button.getTitle(), deeplink);
        }
        ThemedSpecialHeaderDto themedSpecialHeaderDto6 = this.lightTheme;
        Integer b05 = (themedSpecialHeaderDto6 == null || (titleColor4 = themedSpecialHeaderDto6.getTitleColor()) == null) ? null : y2x.b0(titleColor4);
        ThemedSpecialHeaderDto themedSpecialHeaderDto7 = this.darkTheme;
        Integer b06 = (themedSpecialHeaderDto7 == null || (titleColor3 = themedSpecialHeaderDto7.getTitleColor()) == null) ? null : y2x.b0(titleColor3);
        String str = this.title;
        if (str != null) {
            t5rVar = new t5r(str, (b06 == null || b05 == null) ? null : new hfs(c3x.f(b06.intValue()), c3x.f(b05.intValue())));
        } else {
            t5rVar = null;
        }
        ThemedSpecialHeaderDto themedSpecialHeaderDto8 = this.lightTheme;
        Integer b07 = (themedSpecialHeaderDto8 == null || (titleColor2 = themedSpecialHeaderDto8.getTitleColor()) == null) ? null : y2x.b0(titleColor2);
        ThemedSpecialHeaderDto themedSpecialHeaderDto9 = this.darkTheme;
        Integer b08 = (themedSpecialHeaderDto9 == null || (titleColor = themedSpecialHeaderDto9.getTitleColor()) == null) ? null : y2x.b0(titleColor);
        ThemedSpecialHeaderDto themedSpecialHeaderDto10 = this.lightTheme;
        if ((themedSpecialHeaderDto10 != null ? themedSpecialHeaderDto10.getDoodleImageUrl() : null) != null) {
            ThemedSpecialHeaderDto themedSpecialHeaderDto11 = this.darkTheme;
            if ((themedSpecialHeaderDto11 != null ? themedSpecialHeaderDto11.getDoodleImageUrl() : null) != null) {
                String doodleImageUrl = this.lightTheme.getDoodleImageUrl();
                doodleImageUrl.getClass();
                WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS_NO_CROP;
                String pathForSize = new jcv(doodleImageUrl, webPath$Storage).getPathForSize(frv.b() / 2);
                String doodleImageUrl2 = this.darkTheme.getDoodleImageUrl();
                doodleImageUrl2.getClass();
                String pathForSize2 = new jcv(doodleImageUrl2, webPath$Storage).getPathForSize(frv.b() / 2);
                SpecialHeaderDoodleDto specialHeaderDoodleDto = this.doodle;
                r5rVar = new q5r(pathForSize2, pathForSize, (specialHeaderDoodleDto == null || (action3 = specialHeaderDoodleDto.getAction()) == null) ? null : jf0.b0(action3));
                s5r s5rVar = r5rVar;
                themedSpecialHeaderDto = this.lightTheme;
                if ((themedSpecialHeaderDto == null ? themedSpecialHeaderDto.getBgImageUrl() : null) != null) {
                    ThemedSpecialHeaderDto themedSpecialHeaderDto12 = this.darkTheme;
                    if ((themedSpecialHeaderDto12 != null ? themedSpecialHeaderDto12.getBgImageUrl() : null) != null) {
                        String bgImageUrl = this.lightTheme.getBgImageUrl();
                        WebPath$Storage webPath$Storage2 = WebPath$Storage.ENTITY_BACKGROUND_IMG;
                        pair = new Pair(new jcv(bgImageUrl, webPath$Storage2).getPathForSize(wct.t()), new jcv(this.darkTheme.getBgImageUrl(), webPath$Storage2).getPathForSize(wct.t()));
                        String str2 = (String) pair.a;
                        String str3 = (String) pair.b;
                        ThemedSpecialHeaderDto themedSpecialHeaderDto13 = this.lightTheme;
                        animationUrl = themedSpecialHeaderDto13 != null ? themedSpecialHeaderDto13.getAnimationUrl() : null;
                        ThemedSpecialHeaderDto themedSpecialHeaderDto14 = this.darkTheme;
                        animationUrl2 = themedSpecialHeaderDto14 != null ? themedSpecialHeaderDto14.getAnimationUrl() : null;
                        ifs ifsVar2 = (str3 != null || str2 == null) ? null : new ifs(str3, str2);
                        if (animationUrl2 != null && animationUrl != null) {
                            ifsVar = new ifs(animationUrl2, animationUrl);
                        }
                        return new u5r(s5rVar, t5rVar, p5rVar, ifsVar2, ifsVar);
                    }
                }
                pair = new Pair(null, null);
                String str22 = (String) pair.a;
                String str32 = (String) pair.b;
                ThemedSpecialHeaderDto themedSpecialHeaderDto132 = this.lightTheme;
                if (themedSpecialHeaderDto132 != null) {
                }
                ThemedSpecialHeaderDto themedSpecialHeaderDto142 = this.darkTheme;
                if (themedSpecialHeaderDto142 != null) {
                }
                if (str32 != null) {
                }
                if (animationUrl2 != null) {
                    ifsVar = new ifs(animationUrl2, animationUrl);
                }
                return new u5r(s5rVar, t5rVar, p5rVar, ifsVar2, ifsVar);
            }
        }
        if (b07 == null || b08 == null) {
            SpecialHeaderDoodleDto specialHeaderDoodleDto2 = this.doodle;
            r5rVar = new r5r(null, (specialHeaderDoodleDto2 == null || (action = specialHeaderDoodleDto2.getAction()) == null) ? null : jf0.b0(action));
        } else {
            hfs hfsVar = new hfs(c3x.f(b08.intValue()), c3x.f(b07.intValue()));
            SpecialHeaderDoodleDto specialHeaderDoodleDto3 = this.doodle;
            r5rVar = new r5r(hfsVar, (specialHeaderDoodleDto3 == null || (action2 = specialHeaderDoodleDto3.getAction()) == null) ? null : jf0.b0(action2));
        }
        s5r s5rVar2 = r5rVar;
        themedSpecialHeaderDto = this.lightTheme;
        if ((themedSpecialHeaderDto == null ? themedSpecialHeaderDto.getBgImageUrl() : null) != null) {
        }
        pair = new Pair(null, null);
        String str222 = (String) pair.a;
        String str322 = (String) pair.b;
        ThemedSpecialHeaderDto themedSpecialHeaderDto1322 = this.lightTheme;
        if (themedSpecialHeaderDto1322 != null) {
        }
        ThemedSpecialHeaderDto themedSpecialHeaderDto1422 = this.darkTheme;
        if (themedSpecialHeaderDto1422 != null) {
        }
        if (str322 != null) {
        }
        if (animationUrl2 != null) {
        }
        return new u5r(s5rVar2, t5rVar, p5rVar, ifsVar2, ifsVar);
    }
}
