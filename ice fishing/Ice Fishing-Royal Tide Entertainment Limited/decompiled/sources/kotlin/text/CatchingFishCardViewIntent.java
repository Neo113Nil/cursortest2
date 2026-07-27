package kotlin.text;

import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class CatchingFishCardViewIntent extends CatchingFishXMLLayoutGlide {
    public final int CatchingFishStateLiveData;

    public CatchingFishCardViewIntent(int i) {
        this.CatchingFishStateLiveData = i;
    }

    @Override // kotlin.text.CatchingFishXMLLayoutGlide
    public final float CatchingFishCoroutineFlow(CatchingFishOkHttpDagger catchingFishOkHttpDagger) {
        float[] fArr = ((CatchingFishContextGraphQL) catchingFishOkHttpDagger).CatchingFishFragmentFactory;
        if (fArr != null) {
            return fArr[this.CatchingFishStateLiveData];
        }
        return 0.0f;
    }

    @Override // kotlin.text.CatchingFishXMLLayoutGlide
    public final void CatchingFishDagger(CatchingFishOkHttpDagger catchingFishOkHttpDagger, float f) {
        CatchingFishContextGraphQL catchingFishContextGraphQL = (CatchingFishContextGraphQL) catchingFishOkHttpDagger;
        float[] fArr = catchingFishContextGraphQL.CatchingFishFragmentFactory;
        if (fArr != null) {
            int i = this.CatchingFishStateLiveData;
            if (fArr[i] != f) {
                fArr[i] = f;
                CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = catchingFishContextGraphQL.CatchingFishJobScheduler;
                if (catchingFishLayoutCoroutine != null) {
                    float CatchingFishViewModelFAB = catchingFishContextGraphQL.CatchingFishViewModelFAB();
                    MaterialButton materialButton = (MaterialButton) catchingFishLayoutCoroutine.CatchingFishDaggerWebsocket;
                    int i2 = (int) (CatchingFishViewModelFAB * 0.11f);
                    if (materialButton.CatchingFishPayPal != i2) {
                        materialButton.CatchingFishPayPal = i2;
                        materialButton.CatchingFishFragmentHandler();
                        materialButton.invalidate();
                    }
                }
                catchingFishContextGraphQL.invalidateSelf();
            }
        }
    }
}
