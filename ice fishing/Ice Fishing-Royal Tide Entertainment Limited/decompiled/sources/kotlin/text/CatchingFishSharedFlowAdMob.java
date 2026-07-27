package kotlin.text;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class CatchingFishSharedFlowAdMob implements Menu {
    public static final int[] CatchingFishGsonAppCompat = {1, 4, 5, 3, 2, 0};
    public View CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public boolean CatchingFishCoroutine;
    public CatchingFishKtorAdMob CatchingFishDaggerHiltFAB;
    public CatchingFishFABGradleLayout CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishFragmentHandler;
    public final ArrayList CatchingFishLayout;
    public CharSequence CatchingFishOkHttp;
    public final Context CatchingFishParcelableFAB;
    public boolean CatchingFishParcelableFlux;
    public final boolean CatchingFishReduxKtor;
    public final Resources CatchingFishSnackbar;
    public Drawable CatchingFishUnitTesting;
    public boolean CatchingFishViewModelFAB;
    public final ArrayList CatchingFishViewModelScope;
    public final ArrayList CatchingFishWorkManager;
    public int CatchingFishEspressoTesting = 0;
    public boolean CatchingFishStateLiveData = false;
    public boolean CatchingFishRoomDatabase = false;
    public boolean CatchingFishNavigation = false;
    public boolean CatchingFish = false;
    public final ArrayList CatchingFishJetpackCompose = new ArrayList();
    public final CopyOnWriteArrayList CatchingFishCoroutineFlow = new CopyOnWriteArrayList();
    public boolean CatchingFishSpannableWidget = false;

    public CatchingFishSharedFlowAdMob(Context context) {
        boolean z;
        boolean z2 = false;
        this.CatchingFishParcelableFAB = context;
        Resources resources = context.getResources();
        this.CatchingFishSnackbar = resources;
        this.CatchingFishWorkManager = new ArrayList();
        this.CatchingFishViewModelScope = new ArrayList();
        this.CatchingFishViewModelFAB = true;
        this.CatchingFishLayout = new ArrayList();
        this.CatchingFishFragmentHandler = new ArrayList();
        this.CatchingFishCloudMessaging = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB;
            if (Build.VERSION.SDK_INT >= 28) {
                z = CatchingFishRobolectricFlux.CatchingFishStateLiveData(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.CatchingFishReduxKtor = z2;
    }

    public final void CatchingFish(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(CatchingFishFragmentHandler());
        int size = this.CatchingFishWorkManager.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((CatchingFishGradleLifecycle) item.getSubMenu()).CatchingFish(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public boolean CatchingFishAnimationMockk() {
        return this.CatchingFishReduxKtor;
    }

    public final void CatchingFishCoroutine(boolean z) {
        if (this.CatchingFish) {
            return;
        }
        this.CatchingFish = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishCoroutineFlow;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            CatchingFishDaggerHiltGson catchingFishDaggerHiltGson = (CatchingFishDaggerHiltGson) weakReference.get();
            if (catchingFishDaggerHiltGson == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                catchingFishDaggerHiltGson.CatchingFishSnackbar(this, z);
            }
        }
        this.CatchingFish = false;
    }

    public final void CatchingFishCoroutineFlow(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.CatchingFishAnimationMockk = view;
            this.CatchingFishOkHttp = null;
            this.CatchingFishUnitTesting = null;
        } else {
            if (i > 0) {
                this.CatchingFishOkHttp = this.CatchingFishSnackbar.getText(i);
            } else if (charSequence != null) {
                this.CatchingFishOkHttp = charSequence;
            }
            if (i2 > 0) {
                this.CatchingFishUnitTesting = this.CatchingFishParcelableFAB.getDrawable(i2);
            } else if (drawable != null) {
                this.CatchingFishUnitTesting = drawable;
            }
            this.CatchingFishAnimationMockk = null;
        }
        CatchingFishStateLiveData(false);
    }

    public final void CatchingFishDaggerHiltFAB() {
        this.CatchingFishStateLiveData = false;
        if (this.CatchingFishRoomDatabase) {
            this.CatchingFishRoomDatabase = false;
            CatchingFishStateLiveData(this.CatchingFishNavigation);
        }
    }

    public boolean CatchingFishDaggerWebsocket(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        CatchingFishFABGradleLayout catchingFishFABGradleLayout = this.CatchingFishDaggerWebsocket;
        return catchingFishFABGradleLayout != null && catchingFishFABGradleLayout.CatchingFishViewModelFAB(catchingFishSharedFlowAdMob, menuItem);
    }

    public final ArrayList CatchingFishEspressoTesting() {
        boolean z = this.CatchingFishViewModelFAB;
        ArrayList arrayList = this.CatchingFishViewModelScope;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.CatchingFishWorkManager;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList2.get(i);
            if (catchingFishKtorAdMob.isVisible()) {
                arrayList.add(catchingFishKtorAdMob);
            }
        }
        this.CatchingFishViewModelFAB = false;
        this.CatchingFishCloudMessaging = true;
        return arrayList;
    }

    public String CatchingFishFragmentHandler() {
        return "android:menu:actionviewstates";
    }

    public final void CatchingFishJetpackCompose(Bundle bundle) {
        int size = this.CatchingFishWorkManager.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((CatchingFishGradleLifecycle) item.getSubMenu()).CatchingFishJetpackCompose(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(CatchingFishFragmentHandler(), sparseArray);
        }
    }

    public final void CatchingFishLayout() {
        ArrayList CatchingFishEspressoTesting = CatchingFishEspressoTesting();
        if (this.CatchingFishCloudMessaging) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishCoroutineFlow;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                CatchingFishDaggerHiltGson catchingFishDaggerHiltGson = (CatchingFishDaggerHiltGson) weakReference.get();
                if (catchingFishDaggerHiltGson == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= catchingFishDaggerHiltGson.CatchingFishLayout();
                }
            }
            ArrayList arrayList = this.CatchingFishLayout;
            ArrayList arrayList2 = this.CatchingFishFragmentHandler;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = CatchingFishEspressoTesting.size();
                for (int i = 0; i < size; i++) {
                    CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) CatchingFishEspressoTesting.get(i);
                    if ((catchingFishKtorAdMob.CatchingFishParcelableFlux & 32) == 32) {
                        arrayList.add(catchingFishKtorAdMob);
                    } else {
                        arrayList2.add(catchingFishKtorAdMob);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(CatchingFishEspressoTesting());
            }
            this.CatchingFishCloudMessaging = false;
        }
    }

    public final void CatchingFishNavigation(CatchingFishDaggerHiltGson catchingFishDaggerHiltGson) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishCoroutineFlow;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            CatchingFishDaggerHiltGson catchingFishDaggerHiltGson2 = (CatchingFishDaggerHiltGson) weakReference.get();
            if (catchingFishDaggerHiltGson2 == null || catchingFishDaggerHiltGson2 == catchingFishDaggerHiltGson) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public boolean CatchingFishOkHttp() {
        return this.CatchingFishSpannableWidget;
    }

    public final CatchingFishKtorAdMob CatchingFishParcelableFAB(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (CatchingFishGsonAppCompat[i5] << 16) | (65535 & i3);
        CatchingFishKtorAdMob catchingFishKtorAdMob = new CatchingFishKtorAdMob(this, i, i2, i3, i6, charSequence, this.CatchingFishEspressoTesting);
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((CatchingFishKtorAdMob) arrayList.get(size)).CatchingFishReduxKtor <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, catchingFishKtorAdMob);
        CatchingFishStateLiveData(true);
        return catchingFishKtorAdMob;
    }

    public boolean CatchingFishReduxKtor(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishCoroutineFlow;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.CatchingFishDaggerHiltFAB == catchingFishKtorAdMob) {
            CatchingFishSpannableWidget();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                CatchingFishDaggerHiltGson catchingFishDaggerHiltGson = (CatchingFishDaggerHiltGson) weakReference.get();
                if (catchingFishDaggerHiltGson == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = catchingFishDaggerHiltGson.CatchingFishCloudMessaging(catchingFishKtorAdMob);
                    if (z) {
                        break;
                    }
                }
            }
            CatchingFishDaggerHiltFAB();
            if (z) {
                this.CatchingFishDaggerHiltFAB = null;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishRoomDatabase(MenuItem menuItem, CatchingFishDaggerHiltGson catchingFishDaggerHiltGson, int i) {
        boolean z;
        CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) menuItem;
        if (catchingFishKtorAdMob == null || !catchingFishKtorAdMob.isEnabled()) {
            return false;
        }
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishKtorAdMob.CatchingFishUnitTesting;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = catchingFishKtorAdMob.CatchingFishStateLiveData;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(catchingFishKtorAdMob)) && !catchingFishSharedFlowAdMob.CatchingFishDaggerWebsocket(catchingFishSharedFlowAdMob, catchingFishKtorAdMob)) {
            Intent intent = catchingFishKtorAdMob.CatchingFishViewModelScope;
            if (intent != null) {
                try {
                    catchingFishSharedFlowAdMob.CatchingFishParcelableFAB.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                }
            }
            CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor = catchingFishKtorAdMob.CatchingFishPayPal;
            if (catchingFishJUnitAdMobKtor == null || !catchingFishJUnitAdMobKtor.CatchingFishSnackbar.onPerformDefaultAction()) {
                z = false;
                CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor2 = catchingFishKtorAdMob.CatchingFishPayPal;
                boolean z2 = catchingFishJUnitAdMobKtor2 == null && catchingFishJUnitAdMobKtor2.CatchingFishSnackbar.hasSubMenu();
                if (!catchingFishKtorAdMob.CatchingFishDaggerWebsocket()) {
                    z |= catchingFishKtorAdMob.expandActionView();
                    if (z) {
                        CatchingFishCoroutine(true);
                    }
                } else if (catchingFishKtorAdMob.hasSubMenu() || z2) {
                    if ((i & 4) == 0) {
                        CatchingFishCoroutine(false);
                    }
                    if (!catchingFishKtorAdMob.hasSubMenu()) {
                        CatchingFishGradleLifecycle catchingFishGradleLifecycle = new CatchingFishGradleLifecycle(this.CatchingFishParcelableFAB, this, catchingFishKtorAdMob);
                        catchingFishKtorAdMob.CatchingFishAnimationMockk = catchingFishGradleLifecycle;
                        catchingFishGradleLifecycle.setHeaderTitle(catchingFishKtorAdMob.CatchingFishDaggerWebsocket);
                    }
                    CatchingFishGradleLifecycle catchingFishGradleLifecycle2 = catchingFishKtorAdMob.CatchingFishAnimationMockk;
                    if (z2) {
                        catchingFishJUnitAdMobKtor2.CatchingFishSnackbar.onPrepareSubMenu(catchingFishGradleLifecycle2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishCoroutineFlow;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = catchingFishDaggerHiltGson != null ? catchingFishDaggerHiltGson.CatchingFishCoroutine(catchingFishGradleLifecycle2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            CatchingFishDaggerHiltGson catchingFishDaggerHiltGson2 = (CatchingFishDaggerHiltGson) weakReference.get();
                            if (catchingFishDaggerHiltGson2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = catchingFishDaggerHiltGson2.CatchingFishCoroutine(catchingFishGradleLifecycle2);
                            }
                        }
                    }
                    z |= r0;
                    if (!z) {
                        CatchingFishCoroutine(true);
                    }
                } else if ((i & 1) == 0) {
                    CatchingFishCoroutine(true);
                }
                return z;
            }
        }
        z = true;
        CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor22 = catchingFishKtorAdMob.CatchingFishPayPal;
        if (catchingFishJUnitAdMobKtor22 == null) {
        }
        if (!catchingFishKtorAdMob.CatchingFishDaggerWebsocket()) {
        }
        return z;
    }

    public final void CatchingFishSnackbar(CatchingFishDaggerHiltGson catchingFishDaggerHiltGson, Context context) {
        this.CatchingFishCoroutineFlow.add(new WeakReference(catchingFishDaggerHiltGson));
        catchingFishDaggerHiltGson.CatchingFishDaggerWebsocket(context, this);
        this.CatchingFishCloudMessaging = true;
    }

    public final void CatchingFishSpannableWidget() {
        if (this.CatchingFishStateLiveData) {
            return;
        }
        this.CatchingFishStateLiveData = true;
        this.CatchingFishRoomDatabase = false;
        this.CatchingFishNavigation = false;
    }

    public final void CatchingFishStateLiveData(boolean z) {
        if (this.CatchingFishStateLiveData) {
            this.CatchingFishRoomDatabase = true;
            if (z) {
                this.CatchingFishNavigation = true;
                return;
            }
            return;
        }
        if (z) {
            this.CatchingFishViewModelFAB = true;
            this.CatchingFishCloudMessaging = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishCoroutineFlow;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        CatchingFishSpannableWidget();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            CatchingFishDaggerHiltGson catchingFishDaggerHiltGson = (CatchingFishDaggerHiltGson) weakReference.get();
            if (catchingFishDaggerHiltGson == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                catchingFishDaggerHiltGson.CatchingFishWorkManager();
            }
        }
        CatchingFishDaggerHiltFAB();
    }

    public boolean CatchingFishUnitTesting() {
        return this.CatchingFishCoroutine;
    }

    public final void CatchingFishViewModelFAB(List list, int i, KeyEvent keyEvent) {
        boolean CatchingFishUnitTesting = CatchingFishUnitTesting();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.CatchingFishWorkManager;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i2);
                if (catchingFishKtorAdMob.hasSubMenu()) {
                    catchingFishKtorAdMob.CatchingFishAnimationMockk.CatchingFishViewModelFAB(list, i, keyEvent);
                }
                char c = CatchingFishUnitTesting ? catchingFishKtorAdMob.CatchingFishFragmentHandler : catchingFishKtorAdMob.CatchingFishViewModelFAB;
                if ((modifiers & 69647) == ((CatchingFishUnitTesting ? catchingFishKtorAdMob.CatchingFishCloudMessaging : catchingFishKtorAdMob.CatchingFishLayout) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (CatchingFishUnitTesting && c == '\b' && i == 67)) && catchingFishKtorAdMob.isEnabled()) {
                        list.add(catchingFishKtorAdMob);
                    }
                }
            }
        }
    }

    public final CatchingFishKtorAdMob CatchingFishViewModelScope(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.CatchingFishJetpackCompose;
        arrayList.clear();
        CatchingFishViewModelFAB(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (CatchingFishKtorAdMob) arrayList.get(0);
        }
        boolean CatchingFishUnitTesting = CatchingFishUnitTesting();
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i2);
            char c = CatchingFishUnitTesting ? catchingFishKtorAdMob.CatchingFishFragmentHandler : catchingFishKtorAdMob.CatchingFishViewModelFAB;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (CatchingFishUnitTesting && c == '\b' && i == 67))) {
                return catchingFishKtorAdMob;
            }
        }
        return null;
    }

    public boolean CatchingFishWorkManager(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishCoroutineFlow;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        CatchingFishSpannableWidget();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            CatchingFishDaggerHiltGson catchingFishDaggerHiltGson = (CatchingFishDaggerHiltGson) weakReference.get();
            if (catchingFishDaggerHiltGson == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = catchingFishDaggerHiltGson.CatchingFishViewModelFAB(catchingFishKtorAdMob);
                if (z) {
                    break;
                }
            }
        }
        CatchingFishDaggerHiltFAB();
        if (z) {
            this.CatchingFishDaggerHiltFAB = catchingFishKtorAdMob;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return CatchingFishParcelableFAB(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.CatchingFishParcelableFAB.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            CatchingFishKtorAdMob CatchingFishParcelableFAB = CatchingFishParcelableFAB(i, i2, i3, resolveInfo.loadLabel(packageManager));
            CatchingFishParcelableFAB.setIcon(resolveInfo.loadIcon(packageManager));
            CatchingFishParcelableFAB.CatchingFishViewModelScope = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = CatchingFishParcelableFAB;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        CatchingFishKtorAdMob catchingFishKtorAdMob = this.CatchingFishDaggerHiltFAB;
        if (catchingFishKtorAdMob != null) {
            CatchingFishReduxKtor(catchingFishKtorAdMob);
        }
        this.CatchingFishWorkManager.clear();
        CatchingFishStateLiveData(true);
    }

    public final void clearHeader() {
        this.CatchingFishUnitTesting = null;
        this.CatchingFishOkHttp = null;
        this.CatchingFishAnimationMockk = null;
        CatchingFishStateLiveData(false);
    }

    @Override // android.view.Menu
    public final void close() {
        CatchingFishCoroutine(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i2);
            if (catchingFishKtorAdMob.CatchingFishParcelableFAB == i) {
                return catchingFishKtorAdMob;
            }
            if (catchingFishKtorAdMob.hasSubMenu() && (findItem = catchingFishKtorAdMob.CatchingFishAnimationMockk.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.CatchingFishWorkManager.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.CatchingFishParcelableFlux) {
            return true;
        }
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((CatchingFishKtorAdMob) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return CatchingFishViewModelScope(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return CatchingFishRoomDatabase(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        CatchingFishKtorAdMob CatchingFishViewModelScope = CatchingFishViewModelScope(i, keyEvent);
        boolean CatchingFishRoomDatabase = CatchingFishViewModelScope != null ? CatchingFishRoomDatabase(CatchingFishViewModelScope, null, i2) : false;
        if ((i2 & 2) != 0) {
            CatchingFishCoroutine(true);
        }
        return CatchingFishRoomDatabase;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((CatchingFishKtorAdMob) arrayList.get(i3)).CatchingFishSnackbar == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((CatchingFishKtorAdMob) arrayList.get(i3)).CatchingFishSnackbar != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.CatchingFishWorkManager;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            CatchingFishStateLiveData(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((CatchingFishKtorAdMob) arrayList.get(i2)).CatchingFishParcelableFAB == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.CatchingFishWorkManager;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            CatchingFishStateLiveData(true);
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i2);
            if (catchingFishKtorAdMob.CatchingFishSnackbar == i) {
                catchingFishKtorAdMob.CatchingFishParcelableFlux = (catchingFishKtorAdMob.CatchingFishParcelableFlux & (-5)) | (z2 ? 4 : 0);
                catchingFishKtorAdMob.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.CatchingFishSpannableWidget = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i2);
            if (catchingFishKtorAdMob.CatchingFishSnackbar == i) {
                catchingFishKtorAdMob.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i2);
            if (catchingFishKtorAdMob.CatchingFishSnackbar == i) {
                int i3 = catchingFishKtorAdMob.CatchingFishParcelableFlux;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                catchingFishKtorAdMob.CatchingFishParcelableFlux = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            CatchingFishStateLiveData(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.CatchingFishCoroutine = z;
        CatchingFishStateLiveData(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.CatchingFishWorkManager.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return CatchingFishParcelableFAB(0, 0, 0, this.CatchingFishSnackbar.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.CatchingFishSnackbar.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return CatchingFishParcelableFAB(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        CatchingFishKtorAdMob CatchingFishParcelableFAB = CatchingFishParcelableFAB(i, i2, i3, charSequence);
        CatchingFishGradleLifecycle catchingFishGradleLifecycle = new CatchingFishGradleLifecycle(this.CatchingFishParcelableFAB, this, CatchingFishParcelableFAB);
        CatchingFishParcelableFAB.CatchingFishAnimationMockk = catchingFishGradleLifecycle;
        catchingFishGradleLifecycle.setHeaderTitle(CatchingFishParcelableFAB.CatchingFishDaggerWebsocket);
        return catchingFishGradleLifecycle;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return CatchingFishParcelableFAB(i, i2, i3, this.CatchingFishSnackbar.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.CatchingFishSnackbar.getString(i4));
    }

    public CatchingFishSharedFlowAdMob CatchingFishCloudMessaging() {
        return this;
    }
}
