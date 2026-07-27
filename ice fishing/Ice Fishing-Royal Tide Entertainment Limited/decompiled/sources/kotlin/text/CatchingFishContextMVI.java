package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishContextMVI {
    public static final CatchingFishContextMVI CatchingFishDaggerWebsocket;
    public static final CatchingFishContextMVI CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishContextMVI[] CatchingFishViewModelScope;
    public static final CatchingFishContextMVI CatchingFishWorkManager;

    static {
        CatchingFishContextMVI catchingFishContextMVI = new CatchingFishContextMVI("DEFAULT", 0);
        CatchingFishReduxKtor = catchingFishContextMVI;
        CatchingFishContextMVI catchingFishContextMVI2 = new CatchingFishContextMVI("VERY_LOW", 1);
        CatchingFishDaggerWebsocket = catchingFishContextMVI2;
        CatchingFishContextMVI catchingFishContextMVI3 = new CatchingFishContextMVI("HIGHEST", 2);
        CatchingFishWorkManager = catchingFishContextMVI3;
        CatchingFishViewModelScope = new CatchingFishContextMVI[]{catchingFishContextMVI, catchingFishContextMVI2, catchingFishContextMVI3};
    }

    public static CatchingFishContextMVI valueOf(String str) {
        return (CatchingFishContextMVI) Enum.valueOf(CatchingFishContextMVI.class, str);
    }

    public static CatchingFishContextMVI[] values() {
        return (CatchingFishContextMVI[]) CatchingFishViewModelScope.clone();
    }
}
