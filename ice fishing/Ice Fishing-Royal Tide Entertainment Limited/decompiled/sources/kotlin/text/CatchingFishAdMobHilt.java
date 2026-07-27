package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishAdMobHilt extends CatchingFishStateFlowGson implements CatchingFishIntentManifest {
    public CatchingFishWebsocketGradle CatchingFishCloudMessaging;
    public CatchingFishManifestMockk CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public final CatchingFishManifestMockk CatchingFishViewModelFAB;
    public final CatchingFishIntentManifest CatchingFishViewModelScope;

    public CatchingFishAdMobHilt(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishManifestMockk catchingFishManifestMockk) {
        super(CatchingFishPayPalManifest.CatchingFishWorkManager, CatchingFishPayPalDataStore.CatchingFishReduxKtor);
        this.CatchingFishViewModelScope = catchingFishIntentManifest;
        this.CatchingFishViewModelFAB = catchingFishManifestMockk;
        this.CatchingFishLayout = ((Number) catchingFishManifestMockk.CatchingFishEspressoTesting(0, new CatchingFishRealmCustomView(6, (byte) 0))).intValue();
    }

    public final Object CatchingFishAnimationMockk(CatchingFishWebsocketGradle catchingFishWebsocketGradle, Object obj) {
        List list;
        Comparable comparable;
        String str;
        CatchingFishManifestMockk context = catchingFishWebsocketGradle.getContext();
        CatchingFishLayoutRoomFAB.CatchingFishSpannableWidget(context);
        CatchingFishManifestMockk catchingFishManifestMockk = this.CatchingFishFragmentHandler;
        if (catchingFishManifestMockk != context) {
            int i = 0;
            if (catchingFishManifestMockk instanceof CatchingFishSnackbarMockk) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((CatchingFishSnackbarMockk) catchingFishManifestMockk).CatchingFishDaggerWebsocket + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "<this>");
                CatchingFishGraphQLGraphQL catchingFishGraphQLGraphQL = new CatchingFishGraphQLGraphQL(str2);
                if (catchingFishGraphQLGraphQL.hasNext()) {
                    Object next = catchingFishGraphQLGraphQL.next();
                    if (catchingFishGraphQLGraphQL.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (catchingFishGraphQLGraphQL.hasNext()) {
                            arrayList.add(catchingFishGraphQLGraphQL.next());
                        }
                        list = arrayList;
                    } else {
                        list = CatchingFishGsonCardView.CatchingFishFragmentFactory(next);
                    }
                } else {
                    list = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!CatchingFishRoomMVVMWidget.CatchingFishSensorManager((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CatchingFishLayoutToast.CatchingFishParcelable(arrayList2));
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (!CatchingFishRobolectricHilt.CatchingFishPayPalService(str3.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(list);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i4 = i + 1;
                    if (i < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i == 0 || i == CatchingFishMotionLayout) && CatchingFishRoomMVVMWidget.CatchingFishSensorManager(str4)) {
                        str = null;
                    } else {
                        CatchingFishFirebaseDagger.CatchingFishNavigation(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                CatchingFishCameraXCameraX.CatchingFishAnimation(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.CatchingFishEspressoTesting(0, new CatchingFishCoroutineLayout(2, this))).intValue() != this.CatchingFishLayout) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.CatchingFishViewModelFAB + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.CatchingFishFragmentHandler = context;
        }
        this.CatchingFishCloudMessaging = catchingFishWebsocketGradle;
        CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP = CatchingFishRealmDagger.CatchingFishParcelableFAB;
        CatchingFishIntentManifest catchingFishIntentManifest = this.CatchingFishViewModelScope;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishIntentManifest, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object CatchingFishReduxKtor = catchingFishJobSchedulerMVP.CatchingFishReduxKtor(catchingFishIntentManifest, obj, this);
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishReduxKtor, CatchingFishXMLLayoutMockk.CatchingFishReduxKtor)) {
            this.CatchingFishCloudMessaging = null;
        }
        return CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final StackTraceElement CatchingFishEspressoTesting() {
        return null;
    }

    @Override // kotlin.text.CatchingFishIntentManifest
    public final Object CatchingFishLayout(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        try {
            Object CatchingFishAnimationMockk = CatchingFishAnimationMockk(catchingFishWebsocketGradle, obj);
            return CatchingFishAnimationMockk == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor ? CatchingFishAnimationMockk : CatchingFishRealmContext.CatchingFishParcelableFAB;
        } catch (Throwable th) {
            this.CatchingFishFragmentHandler = new CatchingFishSnackbarMockk(th, catchingFishWebsocketGradle.getContext());
            throw th;
        }
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        Throwable CatchingFishParcelableFAB = CatchingFishMVILayoutBundle.CatchingFishParcelableFAB(obj);
        if (CatchingFishParcelableFAB != null) {
            this.CatchingFishFragmentHandler = new CatchingFishSnackbarMockk(CatchingFishParcelableFAB, getContext());
        }
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishCloudMessaging;
        if (catchingFishWebsocketGradle != null) {
            catchingFishWebsocketGradle.CatchingFishViewModelFAB(obj);
        }
        return CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX, kotlin.text.CatchingFishSpannableRedux
    public final CatchingFishSpannableRedux CatchingFishViewModelScope() {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishCloudMessaging;
        if (catchingFishWebsocketGradle instanceof CatchingFishSpannableRedux) {
            return (CatchingFishSpannableRedux) catchingFishWebsocketGradle;
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishStateFlowGson, kotlin.text.CatchingFishWebsocketGradle
    public final CatchingFishManifestMockk getContext() {
        CatchingFishManifestMockk catchingFishManifestMockk = this.CatchingFishFragmentHandler;
        return catchingFishManifestMockk == null ? CatchingFishPayPalDataStore.CatchingFishReduxKtor : catchingFishManifestMockk;
    }
}
