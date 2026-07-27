package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.catchingfish.fishcatcherpro.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class CatchingFishMVVMViewMoshi {
    public final int[][] CatchingFishCoroutine;
    public final CatchingFishMVPLayoutBundle CatchingFishDaggerWebsocket;
    public final int CatchingFishParcelableFAB;
    public final CatchingFishFragmentMVVM[] CatchingFishReduxKtor;
    public final CatchingFishFragmentMVVM CatchingFishSnackbar;
    public final CatchingFishMVPLayoutBundle CatchingFishViewModelFAB;
    public final CatchingFishMVPLayoutBundle CatchingFishViewModelScope;
    public final CatchingFishMVPLayoutBundle CatchingFishWorkManager;

    public CatchingFishMVVMViewMoshi(CatchingFishViewHilt catchingFishViewHilt) {
        this.CatchingFishParcelableFAB = catchingFishViewHilt.CatchingFishSnackbar;
        this.CatchingFishSnackbar = (CatchingFishFragmentMVVM) catchingFishViewHilt.CatchingFishCoroutine;
        this.CatchingFishCoroutine = (int[][]) catchingFishViewHilt.CatchingFishReduxKtor;
        this.CatchingFishReduxKtor = (CatchingFishFragmentMVVM[]) catchingFishViewHilt.CatchingFishDaggerWebsocket;
        this.CatchingFishDaggerWebsocket = (CatchingFishMVPLayoutBundle) catchingFishViewHilt.CatchingFishWorkManager;
        this.CatchingFishWorkManager = (CatchingFishMVPLayoutBundle) catchingFishViewHilt.CatchingFishViewModelScope;
        this.CatchingFishViewModelScope = (CatchingFishMVPLayoutBundle) catchingFishViewHilt.CatchingFishViewModelFAB;
        this.CatchingFishViewModelFAB = (CatchingFishMVPLayoutBundle) catchingFishViewHilt.CatchingFishLayout;
    }

    public static void CatchingFishParcelableFAB(CatchingFishViewHilt catchingFishViewHilt, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = CatchingFishSnackbarPicasso.CatchingFishNavigation;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                CatchingFishFragmentMVVM CatchingFishParcelableFAB = CatchingFishFragmentMVVM.CatchingFishParcelableFAB(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0), new CatchingFishEspressoTesting(0)).CatchingFishParcelableFAB();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                catchingFishViewHilt.CatchingFishParcelableFAB(StateSet.trimStateSet(iArr2, i), CatchingFishParcelableFAB);
            }
        }
    }

    public static CatchingFishMVVMViewMoshi CatchingFishSnackbar(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        CatchingFishViewHilt catchingFishViewHilt = new CatchingFishViewHilt(1);
        catchingFishViewHilt.CatchingFishCoroutine();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            catchingFishViewHilt.CatchingFishCoroutine();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            CatchingFishParcelableFAB(catchingFishViewHilt, context, xml, asAttributeSet, context.getTheme());
        }
        xml.close();
        if (catchingFishViewHilt.CatchingFishSnackbar == 0) {
            return null;
        }
        return new CatchingFishMVVMViewMoshi(catchingFishViewHilt);
    }

    public final CatchingFishFragmentMVVM CatchingFishCoroutine() {
        CatchingFishFragmentMVVM catchingFishFragmentMVVM = this.CatchingFishSnackbar;
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle = this.CatchingFishViewModelFAB;
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle2 = this.CatchingFishViewModelScope;
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle3 = this.CatchingFishWorkManager;
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle4 = this.CatchingFishDaggerWebsocket;
        if (catchingFishMVPLayoutBundle4 == null && catchingFishMVPLayoutBundle3 == null && catchingFishMVPLayoutBundle2 == null && catchingFishMVPLayoutBundle == null) {
            return catchingFishFragmentMVVM;
        }
        CatchingFishKtorMVI CatchingFishWorkManager = catchingFishFragmentMVVM.CatchingFishWorkManager();
        if (catchingFishMVPLayoutBundle4 != null) {
            CatchingFishWorkManager.CatchingFishDaggerWebsocket = catchingFishMVPLayoutBundle4.CatchingFishSnackbar;
        }
        if (catchingFishMVPLayoutBundle3 != null) {
            CatchingFishWorkManager.CatchingFishWorkManager = catchingFishMVPLayoutBundle3.CatchingFishSnackbar;
        }
        if (catchingFishMVPLayoutBundle2 != null) {
            CatchingFishWorkManager.CatchingFishViewModelFAB = catchingFishMVPLayoutBundle2.CatchingFishSnackbar;
        }
        if (catchingFishMVPLayoutBundle != null) {
            CatchingFishWorkManager.CatchingFishViewModelScope = catchingFishMVPLayoutBundle.CatchingFishSnackbar;
        }
        return CatchingFishWorkManager.CatchingFishParcelableFAB();
    }

    public final boolean CatchingFishReduxKtor() {
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle;
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle2;
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle3;
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle4;
        return this.CatchingFishParcelableFAB > 1 || ((catchingFishMVPLayoutBundle = this.CatchingFishDaggerWebsocket) != null && catchingFishMVPLayoutBundle.CatchingFishParcelableFAB > 1) || (((catchingFishMVPLayoutBundle2 = this.CatchingFishWorkManager) != null && catchingFishMVPLayoutBundle2.CatchingFishParcelableFAB > 1) || (((catchingFishMVPLayoutBundle3 = this.CatchingFishViewModelScope) != null && catchingFishMVPLayoutBundle3.CatchingFishParcelableFAB > 1) || ((catchingFishMVPLayoutBundle4 = this.CatchingFishViewModelFAB) != null && catchingFishMVPLayoutBundle4.CatchingFishParcelableFAB > 1)));
    }
}
