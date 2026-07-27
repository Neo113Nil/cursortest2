package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishContextAndroidX {
    public static final CatchingFishContextAndroidX CatchingFishDaggerWebsocket;
    public static final /* synthetic */ CatchingFishContextAndroidX[] CatchingFishFragmentHandler;
    public static final CatchingFishContextAndroidX CatchingFishLayout;
    public static final CatchingFishContextAndroidX CatchingFishReduxKtor;
    public static final CatchingFishContextAndroidX CatchingFishViewModelFAB;
    public static final CatchingFishContextAndroidX CatchingFishViewModelScope;
    public static final CatchingFishContextAndroidX CatchingFishWorkManager;

    static {
        CatchingFishContextAndroidX catchingFishContextAndroidX = new CatchingFishContextAndroidX("ShutDown", 0);
        CatchingFishReduxKtor = catchingFishContextAndroidX;
        CatchingFishContextAndroidX catchingFishContextAndroidX2 = new CatchingFishContextAndroidX("ShuttingDown", 1);
        CatchingFishDaggerWebsocket = catchingFishContextAndroidX2;
        CatchingFishContextAndroidX catchingFishContextAndroidX3 = new CatchingFishContextAndroidX("Inactive", 2);
        CatchingFishWorkManager = catchingFishContextAndroidX3;
        CatchingFishContextAndroidX catchingFishContextAndroidX4 = new CatchingFishContextAndroidX("InactivePendingWork", 3);
        CatchingFishViewModelScope = catchingFishContextAndroidX4;
        CatchingFishContextAndroidX catchingFishContextAndroidX5 = new CatchingFishContextAndroidX("Idle", 4);
        CatchingFishViewModelFAB = catchingFishContextAndroidX5;
        CatchingFishContextAndroidX catchingFishContextAndroidX6 = new CatchingFishContextAndroidX("PendingWork", 5);
        CatchingFishLayout = catchingFishContextAndroidX6;
        CatchingFishFragmentHandler = new CatchingFishContextAndroidX[]{catchingFishContextAndroidX, catchingFishContextAndroidX2, catchingFishContextAndroidX3, catchingFishContextAndroidX4, catchingFishContextAndroidX5, catchingFishContextAndroidX6};
    }

    public static CatchingFishContextAndroidX valueOf(String str) {
        return (CatchingFishContextAndroidX) Enum.valueOf(CatchingFishContextAndroidX.class, str);
    }

    public static CatchingFishContextAndroidX[] values() {
        return (CatchingFishContextAndroidX[]) CatchingFishFragmentHandler.clone();
    }
}
