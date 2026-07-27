package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishContextToolbar implements CatchingFishToastToast {
    public final float CatchingFishDaggerWebsocket;
    public final CatchingFishHilt CatchingFishReduxKtor;

    public CatchingFishContextToolbar(CatchingFishHilt catchingFishHilt, float f) {
        this.CatchingFishReduxKtor = catchingFishHilt;
        this.CatchingFishDaggerWebsocket = f;
    }

    @Override // kotlin.text.CatchingFishToastToast
    public final long CatchingFishCoroutine() {
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return CatchingFishToastFragment.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishToastToast
    public final float CatchingFishParcelableFAB() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishToastToast
    public final CatchingFishRobolectricHilt CatchingFishViewModelScope() {
        return this.CatchingFishReduxKtor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishContextToolbar)) {
            return false;
        }
        CatchingFishContextToolbar catchingFishContextToolbar = (CatchingFishContextToolbar) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishContextToolbar.CatchingFishReduxKtor) && Float.compare(this.CatchingFishDaggerWebsocket, catchingFishContextToolbar.CatchingFishDaggerWebsocket) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishDaggerWebsocket) + (this.CatchingFishReduxKtor.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", alpha=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishDaggerWebsocket, ')');
    }
}
