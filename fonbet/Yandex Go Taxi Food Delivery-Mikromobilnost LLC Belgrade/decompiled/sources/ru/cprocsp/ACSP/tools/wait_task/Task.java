package ru.cprocsp.ACSP.tools.wait_task;

import android.os.AsyncTask;

/* loaded from: classes4.dex */
public class Task extends AsyncTask<Void, String, Integer> implements TaskUtility {
    private String mProgressMessage;
    private IProgressTracker mProgressTracker;
    private Integer mResult;

    public Task(String str) {
        this.mProgressMessage = str;
    }

    @Override // android.os.AsyncTask
    public Integer doInBackground(Void... voidArr) {
        publishProgress(this.mProgressMessage);
        return -1;
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        this.mProgressTracker = null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Integer num) {
        this.mResult = num;
        IProgressTracker iProgressTracker = this.mProgressTracker;
        if (iProgressTracker != null) {
            iProgressTracker.onComplete();
        }
        this.mProgressTracker = null;
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(String... strArr) {
        String str = strArr[0];
        this.mProgressMessage = str;
        IProgressTracker iProgressTracker = this.mProgressTracker;
        if (iProgressTracker != null) {
            iProgressTracker.onProgress(str);
        }
    }

    public void setProgressTracker(IProgressTracker iProgressTracker) {
        this.mProgressTracker = iProgressTracker;
        if (iProgressTracker != null) {
            iProgressTracker.onProgress(this.mProgressMessage);
            if (this.mResult != null) {
                this.mProgressTracker.onComplete();
            }
        }
    }
}
