package kotlin.text;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class CatchingFishHiltHilt {
    public final Object[] CatchingFishParcelableFAB = new Object[2];
    public static final Class[] CatchingFishSnackbar = {Context.class, AttributeSet.class};
    public static final int[] CatchingFishCoroutine = {R.attr.onClick};
    public static final int[] CatchingFishReduxKtor = {R.attr.accessibilityHeading};
    public static final int[] CatchingFishDaggerWebsocket = {R.attr.accessibilityPaneTitle};
    public static final int[] CatchingFishWorkManager = {R.attr.screenReaderFocusable};
    public static final String[] CatchingFishViewModelScope = {"android.widget.", "android.view.", "android.webkit."};
    public static final CatchingFishGraphQLRealmFAB CatchingFishViewModelFAB = new CatchingFishGraphQLRealmFAB(0);

    public CatchingFishViewDatabinding CatchingFishCoroutine(Context context, AttributeSet attributeSet) {
        return new CatchingFishViewDatabinding(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.checkboxStyle);
    }

    public CatchingFishDataStoreBundle CatchingFishDaggerWebsocket(Context context, AttributeSet attributeSet) {
        return new CatchingFishDataStoreBundle(context, attributeSet);
    }

    public CatchingFishRoomFlux CatchingFishParcelableFAB(Context context, AttributeSet attributeSet) {
        return new CatchingFishRoomFlux(context, attributeSet);
    }

    public CatchingFishGlideView CatchingFishReduxKtor(Context context, AttributeSet attributeSet) {
        return new CatchingFishGlideView(context, attributeSet);
    }

    public CatchingFishHiltHandler CatchingFishSnackbar(Context context, AttributeSet attributeSet) {
        return new CatchingFishHiltHandler(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.buttonStyle);
    }

    public final View CatchingFishWorkManager(Context context, String str, String str2) {
        String concat;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = CatchingFishViewModelFAB;
        Constructor constructor = (Constructor) catchingFishGraphQLRealmFAB.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(CatchingFishSnackbar);
            catchingFishGraphQLRealmFAB.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.CatchingFishParcelableFAB);
    }
}
