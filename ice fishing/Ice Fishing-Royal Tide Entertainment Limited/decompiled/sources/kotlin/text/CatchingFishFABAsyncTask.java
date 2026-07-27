package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class CatchingFishFABAsyncTask {
    public static final ThreadLocal CatchingFishParcelableFAB = new ThreadLocal();
    public static final WeakHashMap CatchingFishSnackbar = new WeakHashMap(0);
    public static final Object CatchingFishCoroutine = new Object();

    public static Typeface CatchingFishParcelableFAB(Context context, int i, TypedValue typedValue, int i2, CatchingFishOkHttpFAB catchingFishOkHttpFAB, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            CatchingFishGsonIntent catchingFishGsonIntent = CatchingFishGraphQLAdMob.CatchingFishSnackbar;
            Typeface typeface2 = (Typeface) catchingFishGsonIntent.CatchingFishWorkManager(CatchingFishGraphQLAdMob.CatchingFishSnackbar(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (catchingFishOkHttpFAB != null) {
                    new Handler(Looper.getMainLooper()).post(new CatchingFishEspressoFlux(13, catchingFishOkHttpFAB, typeface2));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        CatchingFishGsonHiltMoshi CatchingFishHandler = CatchingFishLayoutRoomFAB.CatchingFishHandler(resources.getXml(i), resources);
                        if (CatchingFishHandler != null) {
                            typeface = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB(context, CatchingFishHandler, resources, i, charSequence2, typedValue.assetCookie, i2, catchingFishOkHttpFAB, z);
                        } else if (catchingFishOkHttpFAB != null) {
                            catchingFishOkHttpFAB.CatchingFishDaggerWebsocket(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface CatchingFishEspressoTesting = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB.CatchingFishEspressoTesting(context, resources, i, charSequence2, i2);
                        if (CatchingFishEspressoTesting != null) {
                            catchingFishGsonIntent.CatchingFishFragmentHandler(CatchingFishGraphQLAdMob.CatchingFishSnackbar(resources, i, charSequence2, i4, i2), CatchingFishEspressoTesting);
                        }
                        if (catchingFishOkHttpFAB != null) {
                            if (CatchingFishEspressoTesting != null) {
                                new Handler(Looper.getMainLooper()).post(new CatchingFishEspressoFlux(13, catchingFishOkHttpFAB, CatchingFishEspressoTesting));
                            } else {
                                catchingFishOkHttpFAB.CatchingFishDaggerWebsocket(-3);
                            }
                        }
                        typeface = CatchingFishEspressoTesting;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (catchingFishOkHttpFAB != null) {
                        catchingFishOkHttpFAB.CatchingFishDaggerWebsocket(-3);
                    }
                }
            }
        } else if (catchingFishOkHttpFAB != null) {
            catchingFishOkHttpFAB.CatchingFishDaggerWebsocket(-3);
        }
        if (typeface != null || catchingFishOkHttpFAB != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
