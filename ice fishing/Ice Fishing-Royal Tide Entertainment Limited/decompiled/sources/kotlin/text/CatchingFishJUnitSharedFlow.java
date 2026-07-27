package kotlin.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitSharedFlow extends CatchingFishGlideWebsocket {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, CatchingFishJUnitSharedFlow> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected CatchingFishToastDaggerHilt unknownFields;

    public CatchingFishJUnitSharedFlow() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = CatchingFishToastDaggerHilt.CatchingFishWorkManager;
    }

    public static Object CatchingFishDaggerWebsocket(Method method, CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow, Object... objArr) {
        try {
            return method.invoke(catchingFishJUnitSharedFlow, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void CatchingFishFragmentHandler(Class cls, CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow) {
        catchingFishJUnitSharedFlow.CatchingFishViewModelFAB();
        defaultInstanceMap.put(cls, catchingFishJUnitSharedFlow);
    }

    public static CatchingFishJUnitSharedFlow CatchingFishReduxKtor(Class cls) {
        CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow = defaultInstanceMap.get(cls);
        if (catchingFishJUnitSharedFlow == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                catchingFishJUnitSharedFlow = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (catchingFishJUnitSharedFlow != null) {
            return catchingFishJUnitSharedFlow;
        }
        CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow2 = (CatchingFishJUnitSharedFlow) ((CatchingFishJUnitSharedFlow) CatchingFishGradleViewModel.CatchingFishReduxKtor(cls)).CatchingFishCoroutine(6);
        if (catchingFishJUnitSharedFlow2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, catchingFishJUnitSharedFlow2);
        return catchingFishJUnitSharedFlow2;
    }

    public static final boolean CatchingFishWorkManager(CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow, boolean z) {
        byte byteValue = ((Byte) catchingFishJUnitSharedFlow.CatchingFishCoroutine(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        catchingFishCoroutineHilt.getClass();
        boolean CatchingFishWorkManager = catchingFishCoroutineHilt.CatchingFishParcelableFAB(catchingFishJUnitSharedFlow.getClass()).CatchingFishWorkManager(catchingFishJUnitSharedFlow);
        if (z) {
            catchingFishJUnitSharedFlow.CatchingFishCoroutine(2);
        }
        return CatchingFishWorkManager;
    }

    public final void CatchingFishCloudMessaging(int i) {
        if (i < 0) {
            throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public abstract Object CatchingFishCoroutine(int i);

    public final CatchingFishJUnitSharedFlow CatchingFishLayout() {
        return (CatchingFishJUnitSharedFlow) CatchingFishCoroutine(4);
    }

    @Override // kotlin.text.CatchingFishGlideWebsocket
    public final int CatchingFishParcelableFAB(CatchingFishRoomHilt catchingFishRoomHilt) {
        int CatchingFishSnackbar;
        int CatchingFishSnackbar2;
        if (CatchingFishViewModelScope()) {
            if (catchingFishRoomHilt == null) {
                CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
                catchingFishCoroutineHilt.getClass();
                CatchingFishSnackbar2 = catchingFishCoroutineHilt.CatchingFishParcelableFAB(getClass()).CatchingFishSnackbar(this);
            } else {
                CatchingFishSnackbar2 = catchingFishRoomHilt.CatchingFishSnackbar(this);
            }
            if (CatchingFishSnackbar2 >= 0) {
                return CatchingFishSnackbar2;
            }
            throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("serialized size must be non-negative, was ", CatchingFishSnackbar2));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (catchingFishRoomHilt == null) {
            CatchingFishCoroutineHilt catchingFishCoroutineHilt2 = CatchingFishCoroutineHilt.CatchingFishCoroutine;
            catchingFishCoroutineHilt2.getClass();
            CatchingFishSnackbar = catchingFishCoroutineHilt2.CatchingFishParcelableFAB(getClass()).CatchingFishSnackbar(this);
        } else {
            CatchingFishSnackbar = catchingFishRoomHilt.CatchingFishSnackbar(this);
        }
        CatchingFishCloudMessaging(CatchingFishSnackbar);
        return CatchingFishSnackbar;
    }

    @Override // kotlin.text.CatchingFishGlideWebsocket
    public final void CatchingFishSnackbar(CatchingFishViewSnackbar catchingFishViewSnackbar) {
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        catchingFishCoroutineHilt.getClass();
        CatchingFishRoomHilt CatchingFishParcelableFAB = catchingFishCoroutineHilt.CatchingFishParcelableFAB(getClass());
        CatchingFishServiceHilt catchingFishServiceHilt = catchingFishViewSnackbar.CatchingFishCoroutineFlow;
        if (catchingFishServiceHilt == null) {
            catchingFishServiceHilt = new CatchingFishServiceHilt(catchingFishViewSnackbar);
        }
        CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(this, catchingFishServiceHilt);
    }

    public final void CatchingFishViewModelFAB() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final boolean CatchingFishViewModelScope() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        catchingFishCoroutineHilt.getClass();
        return catchingFishCoroutineHilt.CatchingFishParcelableFAB(getClass()).CatchingFishViewModelFAB(this, (CatchingFishJUnitSharedFlow) obj);
    }

    public final int hashCode() {
        if (CatchingFishViewModelScope()) {
            CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
            catchingFishCoroutineHilt.getClass();
            return catchingFishCoroutineHilt.CatchingFishParcelableFAB(getClass()).CatchingFishCoroutine(this);
        }
        if (this.memoizedHashCode == 0) {
            CatchingFishCoroutineHilt catchingFishCoroutineHilt2 = CatchingFishCoroutineHilt.CatchingFishCoroutine;
            catchingFishCoroutineHilt2.getClass();
            this.memoizedHashCode = catchingFishCoroutineHilt2.CatchingFishParcelableFAB(getClass()).CatchingFishCoroutine(this);
        }
        return this.memoizedHashCode;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = CatchingFishHiltGlide.CatchingFishParcelableFAB;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        CatchingFishHiltGlide.CatchingFishCoroutine(this, sb, 0);
        return sb.toString();
    }
}
