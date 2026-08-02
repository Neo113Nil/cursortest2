package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.textfield.TextInputLayout;
import com.miteksystems.misnap.workflow.view.ProgressTrackerView;

/* loaded from: classes3.dex */
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable mSuperState;
    public static final AnonymousClass1 EMPTY_STATE = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new AnonymousClass2(0);

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }

    public AbsSavedState() {
        this.mSuperState = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.mSuperState = readParcelable == null ? EMPTY_STATE : readParcelable;
    }

    /* renamed from: androidx.customview.view.AbsSavedState$2, reason: invalid class name */
    public final class AnonymousClass2 implements Parcelable.ClassLoaderCreator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        public static ProgressTrackerView.a[] a() {
            return a();
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            switch (this.$r8$classId) {
                case 0:
                    if (parcel.readParcelable(classLoader) == null) {
                        return AbsSavedState.EMPTY_STATE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("superState must be null");
                    return null;
                case 1:
                    return new SearchView.SavedState(parcel, classLoader);
                case 2:
                    return new Toolbar.SavedState(parcel, classLoader);
                case 3:
                    return createFromParcel(parcel, classLoader);
                case 4:
                    return new CoordinatorLayout.SavedState(parcel, classLoader);
                case 5:
                    return new Fragment.SavedState(parcel, classLoader);
                case 6:
                    return new RecyclerView.SavedState(parcel, classLoader);
                case 7:
                    return new ViewPager.SavedState(parcel, classLoader);
                case 8:
                    ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, classLoader);
                    savedState.mRecyclerViewId = parcel.readInt();
                    savedState.mCurrentItem = parcel.readInt();
                    savedState.mAdapterState = parcel.readParcelable(classLoader);
                    return savedState;
                case 9:
                    return new BottomAppBar.SavedState(parcel, classLoader);
                case 10:
                    return new BottomSheetBehavior.SavedState(parcel, classLoader);
                case 11:
                    return new MaterialButton.SavedState(parcel, classLoader);
                case 12:
                    return new CheckableImageButton.SavedState(parcel, classLoader);
                case 13:
                    return new SearchBar.SavedState(parcel, classLoader);
                case 14:
                    return new SearchView.SavedState(parcel, classLoader);
                case 15:
                    return new SideSheetBehavior.SavedState(parcel, classLoader);
                case 16:
                    return new ExtendableSavedState(parcel, classLoader);
                case 17:
                    return new TextInputLayout.SavedState(parcel, classLoader);
                default:
                    parcel.getClass();
                    classLoader.getClass();
                    return new ProgressTrackerView.a(parcel, classLoader);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new AbsSavedState[i];
                case 1:
                    return new SearchView.SavedState[i];
                case 2:
                    return new Toolbar.SavedState[i];
                case 3:
                    return new SnapshotStateSet[i];
                case 4:
                    return new CoordinatorLayout.SavedState[i];
                case 5:
                    return new Fragment.SavedState[i];
                case 6:
                    return new RecyclerView.SavedState[i];
                case 7:
                    return new ViewPager.SavedState[i];
                case 8:
                    return new ViewPager2.SavedState[i];
                case 9:
                    return new BottomAppBar.SavedState[i];
                case 10:
                    return new BottomSheetBehavior.SavedState[i];
                case 11:
                    return new MaterialButton.SavedState[i];
                case 12:
                    return new CheckableImageButton.SavedState[i];
                case 13:
                    return new SearchBar.SavedState[i];
                case 14:
                    return new SearchView.SavedState[i];
                case 15:
                    return new SideSheetBehavior.SavedState[i];
                case 16:
                    return new ExtendableSavedState[i];
                case 17:
                    return new TextInputLayout.SavedState[i];
                default:
                    return a();
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    if (parcel.readParcelable(null) == null) {
                        return AbsSavedState.EMPTY_STATE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("superState must be null");
                    return null;
                case 1:
                    return new SearchView.SavedState(parcel, null);
                case 2:
                    return new Toolbar.SavedState(parcel, null);
                case 3:
                    return createFromParcel(parcel, (ClassLoader) null);
                case 4:
                    return new CoordinatorLayout.SavedState(parcel, null);
                case 5:
                    return new Fragment.SavedState(parcel, null);
                case 6:
                    return new RecyclerView.SavedState(parcel, null);
                case 7:
                    return new ViewPager.SavedState(parcel, null);
                case 8:
                    ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, null);
                    savedState.mRecyclerViewId = parcel.readInt();
                    savedState.mCurrentItem = parcel.readInt();
                    savedState.mAdapterState = parcel.readParcelable(null);
                    return savedState;
                case 9:
                    return new BottomAppBar.SavedState(parcel, null);
                case 10:
                    return new BottomSheetBehavior.SavedState(parcel, null);
                case 11:
                    return new MaterialButton.SavedState(parcel, null);
                case 12:
                    return new CheckableImageButton.SavedState(parcel, null);
                case 13:
                    return new SearchBar.SavedState(parcel, null);
                case 14:
                    return new SearchView.SavedState(parcel, null);
                case 15:
                    return new SideSheetBehavior.SavedState(parcel, null);
                case 16:
                    return new ExtendableSavedState(parcel, null);
                case 17:
                    return new TextInputLayout.SavedState(parcel, null);
                default:
                    parcel.getClass();
                    return new ProgressTrackerView.a(parcel, null);
            }
        }

        public static SnapshotStateSet createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
            if (classLoader == null) {
                classLoader = SnapshotStateSet.class.getClassLoader();
            }
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                snapshotStateSet.add(parcel.readValue(classLoader));
            }
            return snapshotStateSet;
        }
    }
}
