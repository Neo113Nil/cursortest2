package kotlin.text;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class CatchingFishPicassoCardView extends MenuInflater {
    public static final Class[] CatchingFishDaggerWebsocket;
    public static final Class[] CatchingFishWorkManager;
    public final Context CatchingFishCoroutine;
    public final Object[] CatchingFishParcelableFAB;
    public Object CatchingFishReduxKtor;
    public final Object[] CatchingFishSnackbar;

    static {
        Class[] clsArr = {Context.class};
        CatchingFishDaggerWebsocket = clsArr;
        CatchingFishWorkManager = clsArr;
    }

    public CatchingFishPicassoCardView(Context context) {
        super(context);
        this.CatchingFishCoroutine = context;
        Object[] objArr = {context};
        this.CatchingFishParcelableFAB = objArr;
        this.CatchingFishSnackbar = objArr;
    }

    public static Object CatchingFishParcelableFAB(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? CatchingFishParcelableFAB(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void CatchingFishSnackbar(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        CatchingFishMVIUnitTesting catchingFishMVIUnitTesting = new CatchingFishMVIUnitTesting(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        catchingFishMVIUnitTesting.CatchingFishSnackbar = 0;
                        catchingFishMVIUnitTesting.CatchingFishCoroutine = 0;
                        catchingFishMVIUnitTesting.CatchingFishReduxKtor = 0;
                        catchingFishMVIUnitTesting.CatchingFishDaggerWebsocket = 0;
                        catchingFishMVIUnitTesting.CatchingFishWorkManager = true;
                        catchingFishMVIUnitTesting.CatchingFishViewModelScope = true;
                    } else if (name2.equals("item")) {
                        if (!catchingFishMVIUnitTesting.CatchingFishViewModelFAB) {
                            CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor = catchingFishMVIUnitTesting.CatchingFishCardViewRealm;
                            if (catchingFishJUnitAdMobKtor == null || !catchingFishJUnitAdMobKtor.CatchingFishSnackbar.hasSubMenu()) {
                                catchingFishMVIUnitTesting.CatchingFishViewModelFAB = true;
                                catchingFishMVIUnitTesting.CatchingFishSnackbar(catchingFishMVIUnitTesting.CatchingFishParcelableFAB.add(catchingFishMVIUnitTesting.CatchingFishSnackbar, catchingFishMVIUnitTesting.CatchingFishLayout, catchingFishMVIUnitTesting.CatchingFishFragmentHandler, catchingFishMVIUnitTesting.CatchingFishCloudMessaging));
                            } else {
                                catchingFishMVIUnitTesting.CatchingFishViewModelFAB = true;
                                catchingFishMVIUnitTesting.CatchingFishSnackbar(catchingFishMVIUnitTesting.CatchingFishParcelableFAB.addSubMenu(catchingFishMVIUnitTesting.CatchingFishSnackbar, catchingFishMVIUnitTesting.CatchingFishLayout, catchingFishMVIUnitTesting.CatchingFishFragmentHandler, catchingFishMVIUnitTesting.CatchingFishCloudMessaging).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = this.CatchingFishCoroutine.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishStateLiveData);
                        catchingFishMVIUnitTesting.CatchingFishSnackbar = obtainStyledAttributes.getResourceId(1, 0);
                        catchingFishMVIUnitTesting.CatchingFishCoroutine = obtainStyledAttributes.getInt(3, 0);
                        catchingFishMVIUnitTesting.CatchingFishReduxKtor = obtainStyledAttributes.getInt(4, 0);
                        catchingFishMVIUnitTesting.CatchingFishDaggerWebsocket = obtainStyledAttributes.getInt(5, 0);
                        catchingFishMVIUnitTesting.CatchingFishWorkManager = obtainStyledAttributes.getBoolean(i, true);
                        catchingFishMVIUnitTesting.CatchingFishViewModelScope = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            int[] iArr = CatchingFishWidgetGlide.CatchingFishRoomDatabase;
                            Context context = this.CatchingFishCoroutine;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                            catchingFishMVIUnitTesting.CatchingFishLayout = obtainStyledAttributes2.getResourceId(i, 0);
                            catchingFishMVIUnitTesting.CatchingFishFragmentHandler = (obtainStyledAttributes2.getInt(6, catchingFishMVIUnitTesting.CatchingFishReduxKtor) & 65535) | (obtainStyledAttributes2.getInt(5, catchingFishMVIUnitTesting.CatchingFishCoroutine) & (-65536));
                            catchingFishMVIUnitTesting.CatchingFishCloudMessaging = obtainStyledAttributes2.getText(7);
                            catchingFishMVIUnitTesting.CatchingFishEspressoTesting = obtainStyledAttributes2.getText(8);
                            catchingFishMVIUnitTesting.CatchingFishOkHttp = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            catchingFishMVIUnitTesting.CatchingFishUnitTesting = string == null ? (char) 0 : string.charAt(0);
                            catchingFishMVIUnitTesting.CatchingFishAnimationMockk = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            catchingFishMVIUnitTesting.CatchingFishStateLiveData = string2 == null ? (char) 0 : string2.charAt(0);
                            catchingFishMVIUnitTesting.CatchingFishRoomDatabase = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                catchingFishMVIUnitTesting.CatchingFishNavigation = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                catchingFishMVIUnitTesting.CatchingFishNavigation = catchingFishMVIUnitTesting.CatchingFishDaggerWebsocket;
                            }
                            catchingFishMVIUnitTesting.CatchingFish = obtainStyledAttributes2.getBoolean(3, false);
                            catchingFishMVIUnitTesting.CatchingFishJetpackCompose = obtainStyledAttributes2.getBoolean(4, catchingFishMVIUnitTesting.CatchingFishWorkManager);
                            catchingFishMVIUnitTesting.CatchingFishCoroutineFlow = obtainStyledAttributes2.getBoolean(1, catchingFishMVIUnitTesting.CatchingFishViewModelScope);
                            catchingFishMVIUnitTesting.CatchingFishDaggerHiltFAB = obtainStyledAttributes2.getInt(21, -1);
                            catchingFishMVIUnitTesting.CatchingFishGsonAppCompat = obtainStyledAttributes2.getString(12);
                            catchingFishMVIUnitTesting.CatchingFishSpannableWidget = obtainStyledAttributes2.getResourceId(13, 0);
                            catchingFishMVIUnitTesting.CatchingFishParcelableFlux = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            if (string3 != null && catchingFishMVIUnitTesting.CatchingFishSpannableWidget == 0 && catchingFishMVIUnitTesting.CatchingFishParcelableFlux == null) {
                                catchingFishMVIUnitTesting.CatchingFishCardViewRealm = (CatchingFishJUnitAdMobKtor) catchingFishMVIUnitTesting.CatchingFishParcelableFAB(string3, CatchingFishWorkManager, this.CatchingFishSnackbar);
                            } else {
                                catchingFishMVIUnitTesting.CatchingFishCardViewRealm = null;
                            }
                            catchingFishMVIUnitTesting.CatchingFishPayPal = obtainStyledAttributes2.getText(17);
                            catchingFishMVIUnitTesting.CatchingFishCardViewView = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                catchingFishMVIUnitTesting.CatchingFishCustomView = CatchingFishRealmPicasso.CatchingFishSnackbar(obtainStyledAttributes2.getInt(19, -1), catchingFishMVIUnitTesting.CatchingFishCustomView);
                            } else {
                                catchingFishMVIUnitTesting.CatchingFishCustomView = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = CatchingFishGsonCardView.CatchingFishSpannableWidget(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                catchingFishMVIUnitTesting.CatchingFishMVPRobolectric = colorStateList;
                            } else {
                                catchingFishMVIUnitTesting.CatchingFishMVPRobolectric = null;
                            }
                            obtainStyledAttributes2.recycle();
                            catchingFishMVIUnitTesting.CatchingFishViewModelFAB = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            catchingFishMVIUnitTesting.CatchingFishViewModelFAB = true;
                            SubMenu addSubMenu = catchingFishMVIUnitTesting.CatchingFishParcelableFAB.addSubMenu(catchingFishMVIUnitTesting.CatchingFishSnackbar, catchingFishMVIUnitTesting.CatchingFishLayout, catchingFishMVIUnitTesting.CatchingFishFragmentHandler, catchingFishMVIUnitTesting.CatchingFishCloudMessaging);
                            catchingFishMVIUnitTesting.CatchingFishSnackbar(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            CatchingFishSnackbar(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof CatchingFishSharedFlowAdMob)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.CatchingFishCoroutine.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof CatchingFishSharedFlowAdMob) {
                    CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = (CatchingFishSharedFlowAdMob) menu;
                    if (!catchingFishSharedFlowAdMob.CatchingFishStateLiveData) {
                        catchingFishSharedFlowAdMob.CatchingFishSpannableWidget();
                        z = true;
                    }
                }
                CatchingFishSnackbar(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((CatchingFishSharedFlowAdMob) menu).CatchingFishDaggerHiltFAB();
                }
                xmlResourceParser.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((CatchingFishSharedFlowAdMob) menu).CatchingFishDaggerHiltFAB();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
