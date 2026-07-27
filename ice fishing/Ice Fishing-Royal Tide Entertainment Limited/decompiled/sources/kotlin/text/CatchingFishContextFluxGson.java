package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishContextFluxGson {
    public static final CatchingFishContextFluxGson CatchingFishDaggerWebsocket;
    public static final CatchingFishContextFluxGson CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishContextFluxGson[] CatchingFishViewModelScope;
    public static final CatchingFishContextFluxGson CatchingFishWorkManager;

    static {
        CatchingFishContextFluxGson catchingFishContextFluxGson = new CatchingFishContextFluxGson("ContinueTraversal", 0);
        CatchingFishReduxKtor = catchingFishContextFluxGson;
        CatchingFishContextFluxGson catchingFishContextFluxGson2 = new CatchingFishContextFluxGson("SkipSubtreeAndContinueTraversal", 1);
        CatchingFishDaggerWebsocket = catchingFishContextFluxGson2;
        CatchingFishContextFluxGson catchingFishContextFluxGson3 = new CatchingFishContextFluxGson("CancelTraversal", 2);
        CatchingFishWorkManager = catchingFishContextFluxGson3;
        CatchingFishViewModelScope = new CatchingFishContextFluxGson[]{catchingFishContextFluxGson, catchingFishContextFluxGson2, catchingFishContextFluxGson3};
    }

    public static CatchingFishContextFluxGson valueOf(String str) {
        return (CatchingFishContextFluxGson) Enum.valueOf(CatchingFishContextFluxGson.class, str);
    }

    public static CatchingFishContextFluxGson[] values() {
        return (CatchingFishContextFluxGson[]) CatchingFishViewModelScope.clone();
    }
}
