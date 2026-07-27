package kotlin.text;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CatchingFishSpannableJUnit implements CatchingFishFABJUnit, CatchingFishMVIGoogleMaps {
    public static final CatchingFishCardViewPicasso CatchingFishCloudMessaging = new CatchingFishCardViewPicasso(0);
    public final Object CatchingFishDaggerWebsocket;
    public final Object CatchingFishFragmentHandler;
    public final Object CatchingFishLayout;
    public final Object CatchingFishReduxKtor;
    public final Object CatchingFishViewModelFAB;
    public final Object CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishSpannableJUnit(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.CatchingFishReduxKtor = obj;
        this.CatchingFishDaggerWebsocket = obj2;
        this.CatchingFishWorkManager = obj3;
        this.CatchingFishViewModelScope = obj4;
        this.CatchingFishViewModelFAB = obj5;
        this.CatchingFishLayout = obj6;
        this.CatchingFishFragmentHandler = obj7;
    }

    public ArrayList CatchingFishCloudMessaging(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.CatchingFishDaggerWebsocket;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishToastKtor catchingFishToastKtor = (CatchingFishToastKtor) obj;
            if (catchingFishToastKtor.CatchingFishDaggerWebsocket == 0) {
                CatchingFishLiveDataHandler catchingFishLiveDataHandler = (CatchingFishLiveDataHandler) ((HashMap) this.CatchingFishReduxKtor).get(catchingFishToastKtor);
                for (CatchingFishFABDagger catchingFishFABDagger : catchingFishToastKtor.CatchingFishSnackbar) {
                    if (hashMap.containsKey(catchingFishFABDagger)) {
                        arrayList2.add(new CatchingFishEspressoFlux(5, (CatchingFishFABWebSocket) ((CatchingFishLiveDataHandler) hashMap.get(catchingFishFABDagger)), catchingFishLiveDataHandler));
                    } else {
                        hashMap.put(catchingFishFABDagger, catchingFishLiveDataHandler);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public synchronized CatchingFishLiveDataHandler CatchingFishCoroutine(CatchingFishFABDagger catchingFishFABDagger) {
        CatchingFishSnackbarMVI catchingFishSnackbarMVI = (CatchingFishSnackbarMVI) ((HashMap) this.CatchingFishWorkManager).get(catchingFishFABDagger);
        if (catchingFishSnackbarMVI != null) {
            return catchingFishSnackbarMVI;
        }
        return CatchingFishCloudMessaging;
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public CatchingFishFABWebSocket CatchingFishDaggerWebsocket(CatchingFishFABDagger catchingFishFABDagger) {
        CatchingFishLiveDataHandler CatchingFishViewModelFAB = CatchingFishViewModelFAB(catchingFishFABDagger);
        return CatchingFishViewModelFAB == null ? new CatchingFishFABWebSocket(CatchingFishFABWebSocket.CatchingFishCoroutine, CatchingFishFABWebSocket.CatchingFishReduxKtor) : CatchingFishViewModelFAB instanceof CatchingFishFABWebSocket ? (CatchingFishFABWebSocket) CatchingFishViewModelFAB : new CatchingFishFABWebSocket(null, CatchingFishViewModelFAB);
    }

    public ArrayList CatchingFishEspressoTesting() {
        HashMap hashMap = (HashMap) this.CatchingFishWorkManager;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.CatchingFishReduxKtor).entrySet()) {
            CatchingFishToastKtor catchingFishToastKtor = (CatchingFishToastKtor) entry.getKey();
            if (catchingFishToastKtor.CatchingFishDaggerWebsocket != 0) {
                CatchingFishLiveDataHandler catchingFishLiveDataHandler = (CatchingFishLiveDataHandler) entry.getValue();
                for (CatchingFishFABDagger catchingFishFABDagger : catchingFishToastKtor.CatchingFishSnackbar) {
                    if (!hashMap2.containsKey(catchingFishFABDagger)) {
                        hashMap2.put(catchingFishFABDagger, new HashSet());
                    }
                    ((Set) hashMap2.get(catchingFishFABDagger)).add(catchingFishLiveDataHandler);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                CatchingFishSnackbarMVI catchingFishSnackbarMVI = (CatchingFishSnackbarMVI) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new CatchingFishEspressoFlux(6, catchingFishSnackbarMVI, (CatchingFishLiveDataHandler) it.next()));
                }
            } else {
                CatchingFishFABDagger catchingFishFABDagger2 = (CatchingFishFABDagger) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                CatchingFishSnackbarMVI catchingFishSnackbarMVI2 = new CatchingFishSnackbarMVI();
                catchingFishSnackbarMVI2.CatchingFishSnackbar = null;
                catchingFishSnackbarMVI2.CatchingFishParcelableFAB = Collections.newSetFromMap(new ConcurrentHashMap());
                catchingFishSnackbarMVI2.CatchingFishParcelableFAB.addAll(set);
                hashMap.put(catchingFishFABDagger2, catchingFishSnackbarMVI2);
            }
        }
        return arrayList;
    }

    public void CatchingFishFragmentHandler() {
        HashMap hashMap = (HashMap) this.CatchingFishDaggerWebsocket;
        HashMap hashMap2 = (HashMap) this.CatchingFishWorkManager;
        for (CatchingFishToastKtor catchingFishToastKtor : ((HashMap) this.CatchingFishReduxKtor).keySet()) {
            for (CatchingFishGlideDaggerHilt catchingFishGlideDaggerHilt : catchingFishToastKtor.CatchingFishCoroutine) {
                boolean z = catchingFishGlideDaggerHilt.CatchingFishSnackbar == 2;
                CatchingFishFABDagger catchingFishFABDagger = catchingFishGlideDaggerHilt.CatchingFishParcelableFAB;
                if (z && !hashMap2.containsKey(catchingFishFABDagger)) {
                    Set set = Collections.EMPTY_SET;
                    CatchingFishSnackbarMVI catchingFishSnackbarMVI = new CatchingFishSnackbarMVI();
                    catchingFishSnackbarMVI.CatchingFishSnackbar = null;
                    catchingFishSnackbarMVI.CatchingFishParcelableFAB = Collections.newSetFromMap(new ConcurrentHashMap());
                    catchingFishSnackbarMVI.CatchingFishParcelableFAB.addAll(set);
                    hashMap2.put(catchingFishFABDagger, catchingFishSnackbarMVI);
                } else if (hashMap.containsKey(catchingFishFABDagger)) {
                    continue;
                } else {
                    int i = catchingFishGlideDaggerHilt.CatchingFishSnackbar;
                    if (i == 1) {
                        throw new CatchingFishGraphQLRealm("Unsatisfied dependency for component " + catchingFishToastKtor + ": " + catchingFishFABDagger);
                    }
                    if (i != 2) {
                        hashMap.put(catchingFishFABDagger, new CatchingFishFABWebSocket(CatchingFishFABWebSocket.CatchingFishCoroutine, CatchingFishFABWebSocket.CatchingFishReduxKtor));
                    }
                }
            }
        }
    }

    public void CatchingFishLayout(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            CatchingFishToastKtor catchingFishToastKtor = (CatchingFishToastKtor) entry.getKey();
            CatchingFishLiveDataHandler catchingFishLiveDataHandler = (CatchingFishLiveDataHandler) entry.getValue();
            int i = catchingFishToastKtor.CatchingFishReduxKtor;
            if (i == 1 || (i == 2 && z)) {
                catchingFishLiveDataHandler.get();
            }
        }
        CatchingFishDataStoreFAB catchingFishDataStoreFAB = (CatchingFishDataStoreFAB) this.CatchingFishViewModelFAB;
        synchronized (catchingFishDataStoreFAB) {
            try {
                arrayDeque = catchingFishDataStoreFAB.CatchingFishSnackbar;
                if (arrayDeque != null) {
                    catchingFishDataStoreFAB.CatchingFishSnackbar = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // kotlin.text.CatchingFishFABJUnit
    public synchronized CatchingFishLiveDataHandler CatchingFishViewModelFAB(CatchingFishFABDagger catchingFishFABDagger) {
        CatchingFishLayoutRoom.CatchingFishViewModelFAB(catchingFishFABDagger, "Null interface requested.");
        return (CatchingFishLiveDataHandler) ((HashMap) this.CatchingFishDaggerWebsocket).get(catchingFishFABDagger);
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        return new CatchingFishGsonRetrofit((Context) ((CatchingFishHandlerMVP) this.CatchingFishReduxKtor).get(), (CatchingFishPayPalHandler) ((CatchingFishHandlerMVP) this.CatchingFishDaggerWebsocket).get(), (CatchingFishOkHttpFirebase) ((CatchingFishHandlerMVP) this.CatchingFishWorkManager).get(), (CatchingFishAppCompatLayout) ((CatchingFishAsyncTaskDagger) this.CatchingFishViewModelScope).get(), (Executor) ((CatchingFishHandlerMVP) this.CatchingFishViewModelFAB).get(), (CatchingFishGsonCameraX) ((CatchingFishHandlerMVP) this.CatchingFishLayout).get(), new CatchingFishMoshiGson(), new CatchingFishExoPlayerMVP(), (CatchingFishEspressoAdMob) ((CatchingFishHandlerMVP) this.CatchingFishFragmentHandler).get());
    }

    public CatchingFishSpannableJUnit(ArrayList arrayList, ArrayList arrayList2, CatchingFishWidgetContext catchingFishWidgetContext) {
        CatchingFishMVVMMVIGson catchingFishMVVMMVIGson = CatchingFishMVVMMVIGson.CatchingFishReduxKtor;
        this.CatchingFishReduxKtor = new HashMap();
        this.CatchingFishDaggerWebsocket = new HashMap();
        this.CatchingFishWorkManager = new HashMap();
        this.CatchingFishViewModelScope = new HashSet();
        this.CatchingFishLayout = new AtomicReference();
        CatchingFishDataStoreFAB catchingFishDataStoreFAB = new CatchingFishDataStoreFAB();
        this.CatchingFishViewModelFAB = catchingFishDataStoreFAB;
        this.CatchingFishFragmentHandler = catchingFishWidgetContext;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(CatchingFishToastKtor.CatchingFishCoroutine(catchingFishDataStoreFAB, CatchingFishDataStoreFAB.class, CatchingFishGlideDataStore.class, CatchingFishMoshiRedux.class));
        int i = 0;
        arrayList3.add(CatchingFishToastKtor.CatchingFishCoroutine(this, CatchingFishSpannableJUnit.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            CatchingFishToastKtor catchingFishToastKtor = (CatchingFishToastKtor) obj;
            if (catchingFishToastKtor != null) {
                arrayList3.add(catchingFishToastKtor);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((CatchingFishLiveDataHandler) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((CatchingFishWidgetContext) this.CatchingFishFragmentHandler).CatchingFishDaggerWebsocket(componentRegistrar));
                        it.remove();
                    }
                } catch (CatchingFishBundleCameraX unused) {
                    it.remove();
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((CatchingFishToastKtor) it2.next()).CatchingFishSnackbar.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.CatchingFishViewModelScope).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.CatchingFishViewModelScope).add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (((HashMap) this.CatchingFishReduxKtor).isEmpty()) {
                CatchingFishFirebaseDagger.CatchingFishGsonAppCompat(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.CatchingFishReduxKtor).keySet());
                arrayList6.addAll(arrayList3);
                CatchingFishFirebaseDagger.CatchingFishGsonAppCompat(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                CatchingFishToastKtor catchingFishToastKtor2 = (CatchingFishToastKtor) obj4;
                ((HashMap) this.CatchingFishReduxKtor).put(catchingFishToastKtor2, new CatchingFishWebsocketOkHttp(new CatchingFishXMLLayoutIntent(i, this, catchingFishToastKtor2)));
            }
            arrayList5.addAll(CatchingFishCloudMessaging(arrayList3));
            arrayList5.addAll(CatchingFishEspressoTesting());
            CatchingFishFragmentHandler();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.CatchingFishLayout).get();
        if (bool != null) {
            CatchingFishLayout((HashMap) this.CatchingFishReduxKtor, bool.booleanValue());
        }
    }
}
