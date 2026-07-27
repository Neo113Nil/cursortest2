package kotlin.text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class CatchingFishContextCardView implements CatchingFishContextRealmMVI {
    public static final SimpleDateFormat CatchingFishParcelableFAB;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        CatchingFishParcelableFAB = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // kotlin.text.CatchingFishViewKtor
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        ((CatchingFishManifestGlide) obj2).CatchingFishParcelableFAB(CatchingFishParcelableFAB.format((Date) obj));
    }
}
