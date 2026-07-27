package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVIToolbarJUnit {
    public final CatchingFishContextLayout CatchingFishCoroutine;
    public final CatchingFishContextLayout CatchingFishParcelableFAB;
    public final CatchingFishContextLayout CatchingFishReduxKtor;
    public final CatchingFishContextLayout CatchingFishSnackbar;

    public CatchingFishMVIToolbarJUnit(CatchingFishContextLayout catchingFishContextLayout, CatchingFishContextLayout catchingFishContextLayout2, CatchingFishContextLayout catchingFishContextLayout3, CatchingFishContextLayout catchingFishContextLayout4) {
        this.CatchingFishParcelableFAB = catchingFishContextLayout;
        this.CatchingFishSnackbar = catchingFishContextLayout2;
        this.CatchingFishCoroutine = catchingFishContextLayout3;
        this.CatchingFishReduxKtor = catchingFishContextLayout4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CatchingFishMVIToolbarJUnit)) {
            return false;
        }
        CatchingFishMVIToolbarJUnit catchingFishMVIToolbarJUnit = (CatchingFishMVIToolbarJUnit) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishMVIToolbarJUnit.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishMVIToolbarJUnit.CatchingFishSnackbar) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishMVIToolbarJUnit.CatchingFishCoroutine) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishMVIToolbarJUnit.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        CatchingFishContextLayout catchingFishContextLayout = this.CatchingFishParcelableFAB;
        int hashCode = (catchingFishContextLayout != null ? catchingFishContextLayout.hashCode() : 0) * 31;
        CatchingFishContextLayout catchingFishContextLayout2 = this.CatchingFishSnackbar;
        int hashCode2 = (hashCode + (catchingFishContextLayout2 != null ? catchingFishContextLayout2.hashCode() : 0)) * 31;
        CatchingFishContextLayout catchingFishContextLayout3 = this.CatchingFishCoroutine;
        int hashCode3 = (hashCode2 + (catchingFishContextLayout3 != null ? catchingFishContextLayout3.hashCode() : 0)) * 31;
        CatchingFishContextLayout catchingFishContextLayout4 = this.CatchingFishReduxKtor;
        return hashCode3 + (catchingFishContextLayout4 != null ? catchingFishContextLayout4.hashCode() : 0);
    }
}
