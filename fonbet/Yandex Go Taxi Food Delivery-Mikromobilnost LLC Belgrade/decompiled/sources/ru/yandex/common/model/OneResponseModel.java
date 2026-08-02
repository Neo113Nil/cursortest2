package ru.yandex.common.model;

import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a270;
import defpackage.aez;
import defpackage.b270;
import defpackage.c270;
import defpackage.cjw0;
import defpackage.ey21;
import defpackage.j3u0;
import defpackage.lvj0;
import defpackage.m7a1;
import defpackage.pi4;
import java.util.HashSet;
import ru.yandex.common.network.Request;
import ru.yandex.common.startup.StartupResponse;

/* loaded from: classes4.dex */
public class OneResponseModel<T extends lvj0> implements Parcelable, a270 {
    protected static final int CONTENT_ONE_REQUEST_MODEL = 0;
    private static final String TAG = "[Y:OneResponseModel]";
    public String id;
    private c270 mListener;
    private Request[] mRequest;
    private T mResponse;
    public static final String ONE_RESPONSE_MODEL = register(OneResponseModel.class);
    public static final Parcelable.Creator<OneResponseModel> CREATOR = new Parcelable.Creator<OneResponseModel>() { // from class: ru.yandex.common.model.OneResponseModel.2
        /* JADX WARN: Incorrect return type in method signature: <T:Lru/yandex/common/model/OneResponseModel;>(Ljava/lang/Class;Landroid/os/Parcel;)TT; */
        private OneResponseModel newModel(Class cls, Parcel parcel) {
            try {
                OneResponseModel oneResponseModel = (OneResponseModel) cls.newInstance();
                oneResponseModel.readFromParcel(parcel);
                return oneResponseModel;
            } catch (ClassCastException e) {
                aez.a(OneResponseModel.TAG, "ClassCastException while creating " + cls.getCanonicalName(), e);
                return null;
            } catch (IllegalAccessException e2) {
                aez.a(OneResponseModel.TAG, "IllegalAccessException while creating " + cls.getCanonicalName(), e2);
                return null;
            } catch (InstantiationException e3) {
                aez.a(OneResponseModel.TAG, "InstantiationException while creating " + cls.getCanonicalName(), e3);
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public OneResponseModel createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            try {
                return newModel(Class.forName(readString), parcel);
            } catch (ClassNotFoundException e) {
                aez.a(OneResponseModel.TAG, "Unknown 'class=" + readString + "' for request creation.", e);
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public OneResponseModel[] newArray(int i) {
            return new OneResponseModel[i];
        }
    };
    private int mState = 0;
    private OneResponseAsyncTask<T> mAsyncTask = null;
    private ey21 startupListener = new b270(this);

    public OneResponseModel(String str) {
        this.id = str;
    }

    public static final String register(Class cls) {
        return cls.getCanonicalName();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String describeModel() {
        return ONE_RESPONSE_MODEL;
    }

    public void execute(Request... requestArr) {
        if (this.mState != 0) {
            aez.c();
            return;
        }
        this.mRequest = requestArr;
        if (requestArr[0].getUuid() != null || !requestArr[0].isUuidNecessary()) {
            execute();
            return;
        }
        setState(1);
        ey21 ey21Var = this.startupListener;
        cjw0 cjw0Var = m7a1.a;
        if (((HashSet) cjw0Var.c) == null) {
            cjw0Var.c = new HashSet();
        }
        ((HashSet) cjw0Var.c).add(ey21Var);
        if (((OneResponseModel) cjw0Var.b) == null) {
            cjw0Var.b = new OneResponseModel("startup-model");
        }
        ((OneResponseModel) cjw0Var.b).setListener(cjw0Var);
        ((OneResponseModel) cjw0Var.b).execute(null);
    }

    public pi4 getBackgroundWorker() {
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Lru/yandex/common/network/Request;>(I)TT; */
    public Request getRequest(int i) {
        Request[] requestArr = this.mRequest;
        if (requestArr == null || i < 0 || i >= requestArr.length) {
            return null;
        }
        return requestArr[i];
    }

    public T getResult() {
        return this.mResponse;
    }

    public int getState() {
        return this.mState;
    }

    public void interrupt() {
        OneResponseAsyncTask<T> oneResponseAsyncTask = this.mAsyncTask;
        if (oneResponseAsyncTask != null) {
            if (oneResponseAsyncTask.cancel(true)) {
                setState(0);
            }
        } else if (getState() == 1) {
            setState(0);
        }
    }

    public void readFromParcel(Parcel parcel) {
        this.id = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            Request[] requestArr = new Request[readInt];
            this.mRequest = requestArr;
            parcel.readTypedArray(requestArr, Request.CREATOR);
        }
    }

    public void setListener(c270 c270Var) {
        this.mListener = c270Var;
    }

    @Override // defpackage.a270
    public void setResult(T t) {
        this.mResponse = t;
    }

    @Override // defpackage.a270
    public void setState(Integer num) {
        if (this.mState == num.intValue()) {
            return;
        }
        this.mState = num.intValue();
        aez.b(TAG, "HTTP SET STATE: " + j3u0.a[num.intValue()]);
        c270 c270Var = this.mListener;
        if (c270Var != null) {
            cjw0 cjw0Var = (cjw0) c270Var;
            cjw0Var.getClass();
            switch (getState()) {
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    cjw0Var.B(null);
                    setState(0);
                    return;
                case 4:
                    cjw0Var.B(((StartupResponse) getResult()).getUuid());
                    throw null;
                default:
                    return;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(describeModel());
        parcel.writeString(this.id);
        Request[] requestArr = this.mRequest;
        if (requestArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(requestArr.length);
            parcel.writeTypedArray(this.mRequest, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void execute() {
        OneResponseAsyncTask<T> oneResponseAsyncTask = new OneResponseAsyncTask<>(getBackgroundWorker(), this);
        this.mAsyncTask = oneResponseAsyncTask;
        oneResponseAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.mRequest);
    }
}
