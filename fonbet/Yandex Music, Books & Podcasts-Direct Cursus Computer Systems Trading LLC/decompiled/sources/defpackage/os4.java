package defpackage;

import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.BottomBlockDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CollageContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CollageDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CollageItemDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TopBlockDto;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public abstract class os4 {
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ns4 a(CollageContentDto collageContentDto) {
        List<CollageItemDto> items;
        rs4 rs4Var;
        EntityCoverDto contentBackground;
        u9b V;
        String e;
        BottomBlockDto bottomBlock;
        pd3 pd3Var;
        TopBlockDto topBlock;
        gps gpsVar;
        List<TopBlockDto.TopItemDto> items2;
        nps npsVar;
        String uri;
        yhm b;
        String key;
        TopBlockDto.TopItemDto.RectangleDto rectangle;
        yhm b2;
        EntityCoverDto background;
        u9b V2;
        List<BottomBlockDto.BottomItemDto> items3;
        je3 je3Var;
        String title;
        String subtitle;
        String key2;
        String title2;
        collageContentDto.getClass();
        CollageDataDto data = collageContentDto.getData();
        if (data == null || (items = data.getItems()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CollageItemDto collageItemDto : items) {
            if (collageItemDto != null && (contentBackground = collageItemDto.getContentBackground()) != null && (V = c3x.V(contentBackground)) != null && (e = V.e(wct.s(), WebPath$Storage.AVATARS)) != null && (bottomBlock = collageItemDto.getBottomBlock()) != null) {
                if (!(bottomBlock instanceof BottomBlockDto.BottomBlockDataDto)) {
                    b6e.s();
                    return null;
                }
                BottomBlockDto.BottomBlockItemsDto data2 = ((BottomBlockDto.BottomBlockDataDto) bottomBlock).getData();
                if (data2 == null || (items3 = data2.getItems()) == null) {
                    pd3Var = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (BottomBlockDto.BottomItemDto bottomItemDto : items3) {
                        if (bottomItemDto != null) {
                            if (bottomItemDto instanceof BottomBlockDto.BottomItemDto.ChosenBottomItemDto) {
                                BottomBlockDto.BottomItemDto.ChosenBottomItemDto chosenBottomItemDto = (BottomBlockDto.BottomItemDto.ChosenBottomItemDto) bottomItemDto;
                                BottomBlockDto.BottomItemDto.ChosenBottomDataDto data3 = chosenBottomItemDto.getData();
                                if (data3 != null && (key2 = data3.getKey()) != null && (title2 = chosenBottomItemDto.getData().getTitle()) != null) {
                                    je3Var = new he3(key2, title2);
                                }
                            } else {
                                if (!(bottomItemDto instanceof BottomBlockDto.BottomItemDto.TextBottomItemDto)) {
                                    b6e.s();
                                    return null;
                                }
                                BottomBlockDto.BottomItemDto.TextBottomItemDto textBottomItemDto = (BottomBlockDto.BottomItemDto.TextBottomItemDto) bottomItemDto;
                                BottomBlockDto.BottomItemDto.TextBottomDataDto data4 = textBottomItemDto.getData();
                                if (data4 != null && (title = data4.getTitle()) != null && (subtitle = textBottomItemDto.getData().getSubtitle()) != null) {
                                    je3Var = new ie3(title, subtitle);
                                }
                            }
                            if (je3Var == null) {
                                arrayList2.add(je3Var);
                            }
                        }
                        je3Var = null;
                        if (je3Var == null) {
                        }
                    }
                    pd3Var = new pd3(arrayList2);
                }
                if (pd3Var != null && (topBlock = collageItemDto.getTopBlock()) != null) {
                    if (!(topBlock instanceof TopBlockDto.TopBlockDataDto)) {
                        b6e.s();
                        return null;
                    }
                    TopBlockDto.TopBlockDataDto topBlockDataDto = (TopBlockDto.TopBlockDataDto) topBlock;
                    TopBlockDto.TopBlockItemsDto data5 = topBlockDataDto.getData();
                    String e2 = (data5 == null || (background = data5.getBackground()) == null || (V2 = c3x.V(background)) == null) ? null : V2.e(wct.s(), WebPath$Storage.AVATARS);
                    TopBlockDto.TopBlockItemsDto data6 = topBlockDataDto.getData();
                    if (data6 == null || (items2 = data6.getItems()) == null) {
                        gpsVar = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (TopBlockDto.TopItemDto topItemDto : items2) {
                            if (topItemDto != null) {
                                if (topItemDto instanceof TopBlockDto.TopItemDto.ChosenImageTopItemDto) {
                                    TopBlockDto.TopItemDto.ChosenImageTopItemDto chosenImageTopItemDto = (TopBlockDto.TopItemDto.ChosenImageTopItemDto) topItemDto;
                                    TopBlockDto.TopItemDto.ChosenImageDataDto data7 = chosenImageTopItemDto.getData();
                                    if (data7 != null && (key = data7.getKey()) != null && (rectangle = chosenImageTopItemDto.getData().getRectangle()) != null && (b2 = b(rectangle)) != null) {
                                        npsVar = new lps(key, b2);
                                    }
                                } else {
                                    if (!(topItemDto instanceof TopBlockDto.TopItemDto.ImageTopItemDto)) {
                                        b6e.s();
                                        return null;
                                    }
                                    TopBlockDto.TopItemDto.ImageTopItemDto imageTopItemDto = (TopBlockDto.TopItemDto.ImageTopItemDto) topItemDto;
                                    TopBlockDto.TopItemDto.ImageDataDto data8 = imageTopItemDto.getData();
                                    if (data8 != null && (uri = data8.getUri()) != null) {
                                        int s = wct.s();
                                        CoverPath jcvVar = uri.length() > 0 ? new jcv(uri, WebPath$Storage.AVATARS) : CoverPath.none();
                                        jcvVar.getClass();
                                        String pathForSize = jcvVar.getPathForSize(s);
                                        pathForSize.getClass();
                                        TopBlockDto.TopItemDto.RectangleDto rectangle2 = imageTopItemDto.getData().getRectangle();
                                        if (rectangle2 != null && (b = b(rectangle2)) != null) {
                                            npsVar = new mps(pathForSize, b);
                                        }
                                    }
                                }
                                if (npsVar == null) {
                                    arrayList3.add(npsVar);
                                }
                            }
                            npsVar = null;
                            if (npsVar == null) {
                            }
                        }
                        gpsVar = new gps(e2, arrayList3);
                    }
                    if (gpsVar != null) {
                        rs4Var = new rs4(e, gpsVar, pd3Var);
                        if (rs4Var == null) {
                            arrayList.add(rs4Var);
                        }
                    }
                }
            }
            rs4Var = null;
            if (rs4Var == null) {
            }
        }
        return new ns4(arrayList);
    }

    public static final yhm b(TopBlockDto.TopItemDto.RectangleDto rectangleDto) {
        Float x = rectangleDto.getX();
        if (x == null) {
            return null;
        }
        float c = yhn.c(x.floatValue(), 0.0f, 100.0f);
        Float y = rectangleDto.getY();
        if (y == null) {
            return null;
        }
        float c2 = yhn.c(y.floatValue(), 0.0f, 100.0f);
        Float z = rectangleDto.getZ();
        if (z == null) {
            return null;
        }
        float c3 = yhn.c(z.floatValue(), 0.0f, 100.0f);
        Float width = rectangleDto.getWidth();
        if (width == null) {
            return null;
        }
        float c4 = yhn.c(width.floatValue(), 0.0f, 100.0f);
        Float height = rectangleDto.getHeight();
        if (height != null) {
            return new yhm(c, c2, c3, c4, yhn.c(height.floatValue(), 0.0f, 100.0f));
        }
        return null;
    }
}
