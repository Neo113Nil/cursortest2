package defpackage;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;

/* loaded from: classes3.dex */
public abstract class qxy0 {
    public static final ColorModel a(Themes themes, int i) {
        return lvy0.a(themes, new ColorModel.Attr(i), new pxy0(0, themes));
    }

    public static final ColorModel b(ThemedParameter themedParameter) {
        return lvy0.b((String) themedParameter.getLight(), (String) themedParameter.getDark(), new oxy0(themedParameter, 0));
    }

    public static final ThemedImageUrlEntity c(Themes themes, String str) {
        String str2;
        if (themes != null && (str2 = (String) themes.getLight()) != null) {
            str = str2;
        }
        return new ThemedImageUrlEntity(str, themes != null ? (String) themes.getDark() : null);
    }
}
