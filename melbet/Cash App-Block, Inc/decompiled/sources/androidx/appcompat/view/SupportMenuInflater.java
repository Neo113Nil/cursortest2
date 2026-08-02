package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.core.internal.view.SupportMenuItem;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class SupportMenuInflater extends MenuInflater {
    public static final Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    public static final Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    public final Object[] mActionProviderConstructorArguments;
    public final Object[] mActionViewConstructorArguments;
    public final Context mContext;
    public Object mRealOwner;

    public final class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        public static final Class[] PARAM_TYPES = {MenuItem.class};
        public Method mMethod;
        public Object mRealOwner;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Object obj = this.mRealOwner;
            Method method = this.mMethod;
            try {
                if (method.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return false;
            }
        }
    }

    public final class MenuState {
        public MenuItemWrapperICS.ActionProviderWrapper itemActionProvider;
        public String itemActionViewClassName;
        public int itemActionViewLayout;
        public boolean itemAdded;
        public int itemAlphabeticModifiers;
        public char itemAlphabeticShortcut;
        public int itemCategoryOrder;
        public int itemCheckable;
        public boolean itemChecked;
        public CharSequence itemContentDescription;
        public boolean itemEnabled;
        public int itemIconResId;
        public int itemId;
        public String itemListenerMethodName;
        public int itemNumericModifiers;
        public char itemNumericShortcut;
        public int itemShowAsAction;
        public CharSequence itemTitle;
        public CharSequence itemTitleCondensed;
        public CharSequence itemTooltipText;
        public boolean itemVisible;
        public final Menu menu;
        public ColorStateList itemIconTintList = null;
        public PorterDuff.Mode itemIconTintMode = null;
        public int groupId = 0;
        public int groupCategory = 0;
        public int groupOrder = 0;
        public int groupCheckable = 0;
        public boolean groupVisible = true;
        public boolean groupEnabled = true;

        public MenuState(Menu menu) {
            this.menu = menu;
        }

        public final Object newInstance(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.mContext.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void setItem(MenuItem menuItem) {
            SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
            Context context = supportMenuInflater.mContext;
            boolean z = false;
            menuItem.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled).setCheckable(this.itemCheckable >= 1).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId);
            int i = this.itemShowAsAction;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.itemListenerMethodName != null) {
                if (context.isRestricted()) {
                    a$$ExternalSyntheticBUOutline0.m$1("The android:onClick attribute cannot be used within a restricted context");
                    return;
                }
                if (supportMenuInflater.mRealOwner == null) {
                    supportMenuInflater.mRealOwner = SupportMenuInflater.findRealOwner(context);
                }
                Object obj = supportMenuInflater.mRealOwner;
                String str = this.itemListenerMethodName;
                InflatedOnMenuItemClickListener inflatedOnMenuItemClickListener = new InflatedOnMenuItemClickListener();
                inflatedOnMenuItemClickListener.mRealOwner = obj;
                Class<?> cls = obj.getClass();
                try {
                    inflatedOnMenuItemClickListener.mMethod = cls.getMethod(str, InflatedOnMenuItemClickListener.PARAM_TYPES);
                    menuItem.setOnMenuItemClickListener(inflatedOnMenuItemClickListener);
                } catch (Exception e) {
                    StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Couldn't resolve menu item onClick handler ", str, " in class ");
                    m3m.append(cls.getName());
                    InflateException inflateException = new InflateException(m3m.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.itemCheckable >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
                    menuItemImpl.mFlags = (menuItemImpl.mFlags & (-5)) | 4;
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    SupportMenuItem supportMenuItem = menuItemWrapperICS.mWrappedObject;
                    try {
                        if (menuItemWrapperICS.mSetExclusiveCheckableMethod == null) {
                            menuItemWrapperICS.mSetExclusiveCheckableMethod = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.mSetExclusiveCheckableMethod.invoke(supportMenuItem, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str2 = this.itemActionViewClassName;
            if (str2 != null) {
                menuItem.setActionView((View) newInstance(str2, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, supportMenuInflater.mActionViewConstructorArguments));
                z = true;
            }
            int i2 = this.itemActionViewLayout;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            MenuItemWrapperICS.ActionProviderWrapper actionProviderWrapper = this.itemActionProvider;
            if (actionProviderWrapper != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).setSupportActionProvider(actionProviderWrapper);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.itemContentDescription;
            boolean z2 = menuItem instanceof SupportMenuItem;
            if (z2) {
                ((SupportMenuItem) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.itemTooltipText;
            if (z2) {
                ((SupportMenuItem) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.itemAlphabeticShortcut;
            int i3 = this.itemAlphabeticModifiers;
            if (z2) {
                ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i3);
            } else {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.itemNumericShortcut;
            int i4 = this.itemNumericModifiers;
            if (z2) {
                ((SupportMenuItem) menuItem).setNumericShortcut(c2, i4);
            } else {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.itemIconTintMode;
            if (mode != null) {
                if (z2) {
                    ((SupportMenuItem) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.itemIconTintList;
            if (colorStateList != null) {
                if (z2) {
                    ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    public static Object findRealOwner(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? findRealOwner(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuBuilder)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.mContext.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuBuilder) {
                    MenuBuilder menuBuilder = (MenuBuilder) menu;
                    if (!menuBuilder.mPreventDispatchingItemsChanged) {
                        menuBuilder.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                parseMenu(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((MenuBuilder) menu).startDispatchingItemsChanged();
                }
                xmlResourceParser.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuBuilder) menu).startDispatchingItemsChanged();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r3 == 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r15 = r2.menu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r3 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r3 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r8 = r17;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0255, code lost:
    
        r3 = r8.next();
        r4 = 2;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r3 = r17.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r3.equals(r11) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r8 = r17;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r3.equals("group") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r2.groupId = 0;
        r2.groupCategory = 0;
        r2.groupOrder = 0;
        r2.groupCheckable = 0;
        r2.groupVisible = true;
        r2.groupEnabled = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r3.equals("item") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r2.itemAdded != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r3 = r2.itemActionProvider;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r3.mInner.hasSubMenu() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r2.itemAdded = true;
        r2.setItem(r15.addSubMenu(r2.groupId, r2.itemId, r2.itemCategoryOrder, r2.itemTitle).getItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r2.itemAdded = true;
        r2.setItem(r15.add(r2.groupId, r2.itemId, r2.itemCategoryOrder, r2.itemTitle));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3.equals("menu") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        r8 = r17;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r10 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        r3 = r17.getName();
        r14 = r3.equals("group");
        r8 = r16.mContext;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r14 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        r3 = r8.obtainStyledAttributes(r18, androidx.appcompat.R$styleable.MenuGroup);
        r2.groupId = r3.getResourceId(1, 0);
        r2.groupCategory = r3.getInt(3, 0);
        r2.groupOrder = r3.getInt(4, 0);
        r2.groupCheckable = r3.getInt(5, 0);
        r2.groupVisible = r3.getBoolean(2, true);
        r2.groupEnabled = r3.getBoolean(0, true);
        r3.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        if (r3.equals("item") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        r3 = com.squareup.wire.GrpcMethod.obtainStyledAttributes(r8, r18, androidx.appcompat.R$styleable.MenuItem);
        r8 = (android.content.res.TypedArray) r3.requestAdapter;
        r2.itemId = r8.getResourceId(2, 0);
        r2.itemCategoryOrder = (r8.getInt(6, r2.groupOrder) & 65535) | (r8.getInt(5, r2.groupCategory) & (-65536));
        r2.itemTitle = r8.getText(7);
        r2.itemTitleCondensed = r8.getText(8);
        r2.itemIconResId = r8.getResourceId(0, 0);
        r13 = r8.getString(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0149, code lost:
    
        if (r13 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0151, code lost:
    
        r2.itemAlphabeticShortcut = r13;
        r2.itemAlphabeticModifiers = r8.getInt(16, 4096);
        r13 = r8.getString(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0163, code lost:
    
        if (r13 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0165, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016b, code lost:
    
        r2.itemNumericShortcut = r13;
        r2.itemNumericModifiers = r8.getInt(20, 4096);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017b, code lost:
    
        if (r8.hasValue(11) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017d, code lost:
    
        r2.itemCheckable = r8.getBoolean(11, false) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
    
        r2.itemChecked = r8.getBoolean(3, false);
        r2.itemVisible = r8.getBoolean(4, r2.groupVisible);
        r2.itemEnabled = r8.getBoolean(1, r2.groupEnabled);
        r2.itemShowAsAction = r8.getInt(21, -1);
        r2.itemListenerMethodName = r8.getString(12);
        r2.itemActionViewLayout = r8.getResourceId(13, 0);
        r2.itemActionViewClassName = r8.getString(15);
        r4 = r8.getString(14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c5, code lost:
    
        if (r4 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c7, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ca, code lost:
    
        if (r13 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ce, code lost:
    
        if (r2.itemActionViewLayout != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d2, code lost:
    
        if (r2.itemActionViewClassName != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d4, code lost:
    
        r2.itemActionProvider = (androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper) r2.newInstance(r4, androidx.appcompat.view.SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, r16.mActionProviderConstructorArguments);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ed, code lost:
    
        r2.itemContentDescription = r8.getText(17);
        r2.itemTooltipText = r8.getText(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0203, code lost:
    
        if (r8.hasValue(19) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0205, code lost:
    
        r2.itemIconTintMode = androidx.appcompat.widget.DrawableUtils.parseTintMode(r8.getInt(19, -1), r2.itemIconTintMode);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021c, code lost:
    
        if (r8.hasValue(18) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021e, code lost:
    
        r2.itemIconTintList = r3.getColorStateList(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0227, code lost:
    
        r3.recycle();
        r2.itemAdded = false;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0225, code lost:
    
        r2.itemIconTintList = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
    
        r4 = null;
        r2.itemIconTintMode = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e1, code lost:
    
        if (r13 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e3, code lost:
    
        android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ea, code lost:
    
        r2.itemActionProvider = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c9, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0184, code lost:
    
        r2.itemCheckable = r2.groupCheckable;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0167, code lost:
    
        r13 = r13.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014d, code lost:
    
        r13 = r13.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0234, code lost:
    
        if (r3.equals("menu") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0236, code lost:
    
        r2.itemAdded = true;
        r3 = r15.addSubMenu(r2.groupId, r2.itemId, r2.itemCategoryOrder, r2.itemTitle);
        r2.setItem(r3.getItem());
        r8 = r17;
        parseMenu(r8, r18, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0251, code lost:
    
        r8 = r17;
        r11 = r3;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x025c, code lost:
    
        com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0.m$1("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0261, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        r9 = false;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r9 != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void parseMenu(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            int i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }
}
