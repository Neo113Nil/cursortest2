package com.catchingfish.fishcatcherpro.presentation.play;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.catchingfish.fishcatcherpro.R;
import com.catchingfish.fishcatcherpro.presentation.menu.MenuGameActivity;
import com.catchingfish.fishcatcherpro.presentation.play.PlayActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.CatchingFishAppCompatGradle;
import kotlin.text.CatchingFishBundleAndroidX;
import kotlin.text.CatchingFishCameraXAdMob;
import kotlin.text.CatchingFishCameraXCameraX;
import kotlin.text.CatchingFishCustomViewKtor;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishFluxLifecycle;
import kotlin.text.CatchingFishFragmentFactory;
import kotlin.text.CatchingFishGradleFlux;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishKtorFlux;
import kotlin.text.CatchingFishKtorHiltIntent;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishMVVMStateFlow;
import kotlin.text.CatchingFishMockkViewRoom;
import kotlin.text.CatchingFishPicassoMVVM;
import kotlin.text.CatchingFishRealmDaggerHilt;
import kotlin.text.CatchingFishRetrofitWidget;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishToastCustomView;
import kotlin.text.CatchingFishViewMockkFlux;
import kotlin.text.CatchingFishWidgetContext;
import kotlin.text.CatchingFishWidgetHilt;
import kotlin.text.CatchingFishXMLLayoutGlide;

/* loaded from: classes.dex */
public final class PlayActivity extends AppCompatActivity {
    public static final /* synthetic */ int CatchingFishMVVMAppCompat = 0;
    public ImageView CatchingFishAnimation;
    public final CatchingFishViewMockkFlux CatchingFishAppCompat;
    public final CatchingFishKtorHiltIntent CatchingFishCameraXIntent = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishCameraXAdMob(this, 0));
    public CatchingFishKtorFlux CatchingFishDagger;
    public final CatchingFishWidgetContext CatchingFishDataStoreIntent;
    public TextView CatchingFishEspressoMockk;
    public final CatchingFishMockkViewRoom CatchingFishGradleManifest;
    public final CatchingFishWidgetHilt CatchingFishHandler;
    public final ArrayList CatchingFishJUnitRealm;
    public GridLayout CatchingFishJobScheduler;
    public final CatchingFishRetrofitWidget CatchingFishLayoutInflater;
    public final CatchingFishServiceHilt CatchingFishMotionLayout;
    public CatchingFishServiceHilt CatchingFishMutableLiveData;
    public final CatchingFishRetrofitWidget CatchingFishParcelable;
    public final CatchingFishGradleFlux CatchingFishPayPalLiveData;
    public FrameLayout CatchingFishPayPalService;
    public final CatchingFishRetrofitWidget CatchingFishRecyclerView;
    public ProgressBar CatchingFishSensorManager;
    public final CatchingFishMVPExoPlayer CatchingFishStateFlow;

    public PlayActivity() {
        CatchingFishWidgetHilt catchingFishWidgetHilt = new CatchingFishWidgetHilt();
        catchingFishWidgetHilt.CatchingFishParcelableFAB = 60000L;
        catchingFishWidgetHilt.CatchingFishSnackbar = 0;
        catchingFishWidgetHilt.CatchingFishCoroutine = 0;
        catchingFishWidgetHilt.CatchingFishReduxKtor = false;
        catchingFishWidgetHilt.CatchingFishDaggerWebsocket = false;
        this.CatchingFishHandler = catchingFishWidgetHilt;
        CatchingFishGradleFlux catchingFishGradleFlux = new CatchingFishGradleFlux(CatchingFishToastCustomView.CatchingFishLayoutInflater(Integer.valueOf(R.drawable.el1), Integer.valueOf(R.drawable.el2), Integer.valueOf(R.drawable.el3)));
        this.CatchingFishPayPalLiveData = catchingFishGradleFlux;
        CatchingFishMockkViewRoom catchingFishMockkViewRoom = new CatchingFishMockkViewRoom();
        this.CatchingFishGradleManifest = catchingFishMockkViewRoom;
        this.CatchingFishMotionLayout = new CatchingFishServiceHilt(28, catchingFishGradleFlux);
        this.CatchingFishLayoutInflater = new CatchingFishRetrofitWidget(catchingFishWidgetHilt);
        this.CatchingFishParcelable = new CatchingFishRetrofitWidget(catchingFishWidgetHilt);
        this.CatchingFishRecyclerView = new CatchingFishRetrofitWidget(catchingFishWidgetHilt);
        this.CatchingFishAppCompat = new CatchingFishViewMockkFlux();
        this.CatchingFishDataStoreIntent = new CatchingFishWidgetContext();
        this.CatchingFishStateFlow = new CatchingFishMVPExoPlayer(14, catchingFishMockkViewRoom);
        this.CatchingFishJUnitRealm = new ArrayList();
    }

    public final void CatchingFishAnimationMockk() {
        ArrayList arrayList = this.CatchingFishJUnitRealm;
        arrayList.clear();
        GridLayout gridLayout = this.CatchingFishJobScheduler;
        if (gridLayout == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
            throw null;
        }
        int rowCount = gridLayout.getRowCount();
        GridLayout gridLayout2 = this.CatchingFishJobScheduler;
        if (gridLayout2 == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
            throw null;
        }
        int columnCount = gridLayout2.getColumnCount();
        CatchingFishGradleFlux catchingFishGradleFlux = (CatchingFishGradleFlux) this.CatchingFishMotionLayout.CatchingFishDaggerWebsocket;
        ArrayList arrayList2 = new ArrayList();
        int i = (rowCount * columnCount) / 2;
        int i2 = 0;
        while (true) {
            int i3 = R.drawable.load2;
            if (i2 >= i) {
                break;
            }
            CatchingFishRealmDaggerHilt catchingFishRealmDaggerHilt = CatchingFishPicassoMVVM.CatchingFishReduxKtor;
            CatchingFishRealmDaggerHilt catchingFishRealmDaggerHilt2 = CatchingFishPicassoMVVM.CatchingFishReduxKtor;
            if (catchingFishRealmDaggerHilt2.CatchingFishReduxKtor().nextFloat() < 0.1f) {
                i3 = R.drawable.el4;
            } else if (catchingFishRealmDaggerHilt2.CatchingFishReduxKtor().nextFloat() >= 0.1f) {
                List list = catchingFishGradleFlux.CatchingFishParcelableFAB;
                i3 = ((Number) list.get(i2 % list.size())).intValue();
            }
            arrayList2.add(Integer.valueOf(i3));
            arrayList2.add(Integer.valueOf(i3));
            i2++;
        }
        CatchingFishCameraXCameraX.CatchingFishAndroidX(arrayList2, CatchingFishHiltMVPToast.CatchingFishParcelableFAB(System.currentTimeMillis()));
        CatchingFishMVVMStateFlow.CatchingFishAppCompat(arrayList, arrayList2);
        FrameLayout frameLayout = this.CatchingFishPayPalService;
        if (frameLayout == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("boardFrame");
            throw null;
        }
        GridLayout gridLayout3 = this.CatchingFishJobScheduler;
        if (gridLayout3 == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
            throw null;
        }
        this.CatchingFishAppCompat.getClass();
        int min = Math.min(frameLayout.getWidth() / gridLayout3.getColumnCount(), frameLayout.getHeight() / gridLayout3.getRowCount()) - 16;
        GridLayout gridLayout4 = this.CatchingFishJobScheduler;
        if (gridLayout4 == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
            throw null;
        }
        int rowCount2 = gridLayout4.getRowCount();
        for (int i4 = 0; i4 < rowCount2; i4++) {
            GridLayout gridLayout5 = this.CatchingFishJobScheduler;
            if (gridLayout5 == null) {
                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
                throw null;
            }
            int columnCount2 = gridLayout5.getColumnCount();
            for (int i5 = 0; i5 < columnCount2; i5++) {
                GridLayout gridLayout6 = this.CatchingFishJobScheduler;
                if (gridLayout6 == null) {
                    CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
                    throw null;
                }
                int intValue = ((Number) arrayList.remove(0)).intValue();
                final ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(min, min));
                imageView.setImageDrawable(getDrawable(intValue));
                imageView.setPadding(8, 8, 8, 8);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: kotlin.text.CatchingFishMVIRoom
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PlayActivity playActivity = PlayActivity.this;
                        CatchingFishMockkViewRoom catchingFishMockkViewRoom = playActivity.CatchingFishGradleManifest;
                        ImageView imageView2 = playActivity.CatchingFishAnimation;
                        ImageView imageView3 = imageView;
                        if (imageView2 == null) {
                            playActivity.CatchingFishAnimation = imageView3;
                            imageView3.startAnimation(AnimationUtils.loadAnimation(playActivity, R.anim.scale_up));
                            imageView3.setAlpha(0.5f);
                            return;
                        }
                        if (imageView3.equals(imageView2)) {
                            imageView3.startAnimation(AnimationUtils.loadAnimation(playActivity, R.anim.scale_down));
                            imageView3.setAlpha(1.0f);
                            playActivity.CatchingFishAnimation = null;
                            return;
                        }
                        catchingFishMockkViewRoom.getClass();
                        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(imageView3.getDrawable().getConstantState(), imageView2.getDrawable().getConstantState())) {
                            imageView3.startAnimation(AnimationUtils.loadAnimation(playActivity, R.anim.scale_up));
                            imageView2.startAnimation(AnimationUtils.loadAnimation(playActivity, R.anim.scale_down));
                            imageView2.setAlpha(1.0f);
                            playActivity.CatchingFishAnimation = imageView3;
                            imageView3.setAlpha(0.5f);
                            CatchingFishWidgetHilt catchingFishWidgetHilt = playActivity.CatchingFishParcelable.CatchingFishParcelableFAB;
                            long j = catchingFishWidgetHilt.CatchingFishParcelableFAB - 5000;
                            catchingFishWidgetHilt.CatchingFishParcelableFAB = j;
                            if (j <= 0) {
                                playActivity.CatchingFishUnitTesting();
                                return;
                            }
                            CatchingFishKtorFlux catchingFishKtorFlux = playActivity.CatchingFishDagger;
                            if (catchingFishKtorFlux == null) {
                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("timerCoordinator");
                                throw null;
                            }
                            CatchingFishAppCompatGradle catchingFishAppCompatGradle = catchingFishKtorFlux.CatchingFishWorkManager;
                            if (catchingFishAppCompatGradle != null) {
                                catchingFishAppCompatGradle.cancel();
                            }
                            catchingFishKtorFlux.CatchingFishParcelableFAB();
                            FrameLayout frameLayout2 = playActivity.CatchingFishPayPalService;
                            if (frameLayout2 != null) {
                                frameLayout2.startAnimation(AnimationUtils.loadAnimation(playActivity, R.anim.fade_red));
                                return;
                            } else {
                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("boardFrame");
                                throw null;
                            }
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(playActivity, R.anim.shrink_and_fade_out);
                        imageView3.startAnimation(loadAnimation);
                        imageView2.startAnimation(loadAnimation);
                        playActivity.CatchingFishPayPalLiveData.getClass();
                        boolean CatchingFishDaggerWebsocket = CatchingFishMockkViewRoom.CatchingFishDaggerWebsocket(imageView3, playActivity, R.drawable.el4);
                        CatchingFishWidgetHilt catchingFishWidgetHilt2 = playActivity.CatchingFishLayoutInflater.CatchingFishParcelableFAB;
                        if (CatchingFishDaggerWebsocket) {
                            catchingFishWidgetHilt2.CatchingFishParcelableFAB += 10000;
                        }
                        catchingFishWidgetHilt2.CatchingFishSnackbar++;
                        catchingFishWidgetHilt2.CatchingFishCoroutine += 100;
                        if (CatchingFishDaggerWebsocket) {
                            CatchingFishKtorFlux catchingFishKtorFlux2 = playActivity.CatchingFishDagger;
                            if (catchingFishKtorFlux2 == null) {
                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("timerCoordinator");
                                throw null;
                            }
                            CatchingFishAppCompatGradle catchingFishAppCompatGradle2 = catchingFishKtorFlux2.CatchingFishWorkManager;
                            if (catchingFishAppCompatGradle2 != null) {
                                catchingFishAppCompatGradle2.cancel();
                            }
                            catchingFishKtorFlux2.CatchingFishParcelableFAB();
                            Toast.makeText(playActivity, "Bonus! +10 seconds", 0).show();
                        }
                        TextView textView = playActivity.CatchingFishEspressoMockk;
                        if (textView == null) {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("scoreLabel");
                            throw null;
                        }
                        textView.setText("Score: " + playActivity.CatchingFishHandler.CatchingFishCoroutine);
                        if (playActivity.CatchingFishRecyclerView.CatchingFishParcelableFAB.CatchingFishSnackbar >= 5) {
                            CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = playActivity.CatchingFishStateFlow;
                            GridLayout gridLayout7 = playActivity.CatchingFishJobScheduler;
                            if (gridLayout7 == null) {
                                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
                                throw null;
                            }
                            catchingFishMVPExoPlayer.getClass();
                            int childCount = gridLayout7.getChildCount();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= childCount) {
                                    break;
                                }
                                View childAt = gridLayout7.getChildAt(i6);
                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                                ImageView imageView4 = (ImageView) childAt;
                                if (CatchingFishMockkViewRoom.CatchingFishDaggerWebsocket(imageView4, playActivity, R.drawable.load2)) {
                                    imageView4.setImageDrawable(playActivity.getDrawable(R.drawable.el5));
                                    imageView4.setVisibility(0);
                                    imageView4.setClickable(true);
                                    Toast.makeText(playActivity, "Secret tile unlocked!", 0).show();
                                    break;
                                }
                                i6++;
                            }
                        }
                        imageView3.setVisibility(4);
                        imageView2.setVisibility(4);
                        playActivity.CatchingFishAnimation = null;
                        CatchingFishWidgetContext catchingFishWidgetContext = playActivity.CatchingFishDataStoreIntent;
                        GridLayout gridLayout8 = playActivity.CatchingFishJobScheduler;
                        if (gridLayout8 == null) {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
                            throw null;
                        }
                        catchingFishWidgetContext.getClass();
                        int childCount2 = gridLayout8.getChildCount();
                        for (int i7 = 0; i7 < childCount2; i7++) {
                            View childAt2 = gridLayout8.getChildAt(i7);
                            CatchingFishFirebaseDagger.CatchingFishStateLiveData(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
                            if (((ImageView) childAt2).getVisibility() == 0) {
                                return;
                            }
                        }
                        Toast.makeText(playActivity, "Level completed! Loading next level...", 0).show();
                        GridLayout gridLayout9 = playActivity.CatchingFishJobScheduler;
                        if (gridLayout9 == null) {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
                            throw null;
                        }
                        gridLayout9.removeAllViews();
                        playActivity.CatchingFishAnimationMockk();
                    }
                });
                this.CatchingFishPayPalLiveData.getClass();
                this.CatchingFishGradleManifest.getClass();
                if (CatchingFishMockkViewRoom.CatchingFishDaggerWebsocket(imageView, this, R.drawable.load2)) {
                    imageView.setVisibility(4);
                    imageView.setClickable(false);
                }
                gridLayout6.addView(imageView);
            }
        }
        FrameLayout frameLayout2 = this.CatchingFishPayPalService;
        if (frameLayout2 == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("boardFrame");
            throw null;
        }
        frameLayout2.postDelayed(new CatchingFishFluxLifecycle(this, 1), 30000L);
    }

    public final void CatchingFishStateLiveData() {
        CatchingFishKtorFlux catchingFishKtorFlux = this.CatchingFishDagger;
        if (catchingFishKtorFlux == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("timerCoordinator");
            throw null;
        }
        catchingFishKtorFlux.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket = false;
        CatchingFishAppCompatGradle catchingFishAppCompatGradle = catchingFishKtorFlux.CatchingFishWorkManager;
        if (catchingFishAppCompatGradle != null) {
            catchingFishAppCompatGradle.cancel();
        }
        catchingFishKtorFlux.CatchingFishWorkManager = null;
        CatchingFishKtorFlux catchingFishKtorFlux2 = this.CatchingFishDagger;
        if (catchingFishKtorFlux2 != null) {
            catchingFishKtorFlux2.CatchingFishSnackbar.removeCallbacks(null);
        } else {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("timerCoordinator");
            throw null;
        }
    }

    public final void CatchingFishUnitTesting() {
        CatchingFishWidgetHilt catchingFishWidgetHilt = this.CatchingFishHandler;
        if (catchingFishWidgetHilt.CatchingFishReduxKtor) {
            return;
        }
        catchingFishWidgetHilt.CatchingFishReduxKtor = true;
        CatchingFishStateLiveData();
        if (isFinishing() || isDestroyed()) {
            return;
        }
        ((CatchingFishBundleAndroidX) this.CatchingFishCameraXIntent.getValue()).CatchingFishParcelableFAB.getClass();
        startActivity(new Intent(this, (Class<?>) MenuGameActivity.class));
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i = R.id.frameLayout;
        if (((FrameLayout) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.frameLayout)) != null) {
            if (((GridLayout) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.gridLayout)) == null) {
                i = R.id.gridLayout;
            } else if (((ProgressBar) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.progressBar)) == null) {
                i = R.id.progressBar;
            } else if (((TextView) CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.scoreTextView)) == null) {
                i = R.id.scoreTextView;
            } else {
                if (CatchingFishHiltMVPToast.CatchingFishEspressoTesting(inflate, R.id.view2) != null) {
                    this.CatchingFishMutableLiveData = new CatchingFishServiceHilt(8, (ConstraintLayout) inflate);
                    CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = ((CatchingFishBundleAndroidX) this.CatchingFishCameraXIntent.getValue()).CatchingFishCoroutine;
                    CatchingFishServiceHilt catchingFishServiceHilt = this.CatchingFishMutableLiveData;
                    if (catchingFishServiceHilt == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                        throw null;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(constraintLayout, "getRoot(...)");
                    catchingFishMVPExoPlayer.CatchingFishEspressoTesting(this, constraintLayout);
                    CatchingFishServiceHilt catchingFishServiceHilt2 = this.CatchingFishMutableLiveData;
                    if (catchingFishServiceHilt2 == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("binding");
                        throw null;
                    }
                    setContentView((ConstraintLayout) catchingFishServiceHilt2.CatchingFishDaggerWebsocket);
                    this.CatchingFishJobScheduler = (GridLayout) findViewById(R.id.gridLayout);
                    this.CatchingFishPayPalService = (FrameLayout) findViewById(R.id.frameLayout);
                    this.CatchingFishSensorManager = (ProgressBar) findViewById(R.id.progressBar);
                    this.CatchingFishEspressoMockk = (TextView) findViewById(R.id.scoreTextView);
                    FrameLayout frameLayout = this.CatchingFishPayPalService;
                    if (frameLayout == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("boardFrame");
                        throw null;
                    }
                    ProgressBar progressBar = this.CatchingFishSensorManager;
                    if (progressBar == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("progressBar");
                        throw null;
                    }
                    CatchingFishKtorFlux catchingFishKtorFlux = new CatchingFishKtorFlux(this.CatchingFishHandler, frameLayout, progressBar, new CatchingFishCameraXAdMob(this, 1), new CatchingFishCustomViewKtor(0, this, PlayActivity.class, "finishGame", "finishGame()V", 0, 0, 3));
                    this.CatchingFishDagger = catchingFishKtorFlux;
                    catchingFishKtorFlux.CatchingFishParcelableFAB();
                    FrameLayout frameLayout2 = this.CatchingFishPayPalService;
                    if (frameLayout2 == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("boardFrame");
                        throw null;
                    }
                    frameLayout2.post(new CatchingFishFluxLifecycle(this, 0));
                    CatchingFishDaggerBiometric.CatchingFishReduxKtor(CatchingFishLayout(), this, new CatchingFishFragmentFactory(9, this));
                    return;
                }
                i = R.id.view2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CatchingFishStateLiveData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        CatchingFishKtorFlux catchingFishKtorFlux = this.CatchingFishDagger;
        if (catchingFishKtorFlux == null) {
            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("timerCoordinator");
            throw null;
        }
        catchingFishKtorFlux.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket = false;
        CatchingFishAppCompatGradle catchingFishAppCompatGradle = catchingFishKtorFlux.CatchingFishWorkManager;
        if (catchingFishAppCompatGradle != null) {
            catchingFishAppCompatGradle.cancel();
        }
    }
}
