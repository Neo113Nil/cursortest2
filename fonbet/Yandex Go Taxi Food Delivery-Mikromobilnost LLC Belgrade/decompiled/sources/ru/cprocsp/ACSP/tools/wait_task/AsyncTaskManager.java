package ru.cprocsp.ACSP.tools.wait_task;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import defpackage.eb3;
import defpackage.voh0;

/* loaded from: classes4.dex */
public final class AsyncTaskManager implements IProgressTracker, DialogInterface.OnCancelListener {
    private Task mAsyncTask;
    private final Dialog mProgressDialog;
    private final OnTaskCompleteListener mTaskCompleteListener;

    private AsyncTaskManager(Context context, OnTaskCompleteListener onTaskCompleteListener, Dialog dialog, boolean z) {
        this.mTaskCompleteListener = onTaskCompleteListener;
        int i = 0;
        if (dialog == null) {
            Dialog dialog2 = new Dialog(context);
            this.mProgressDialog = dialog2;
            dialog2.setContentView(voh0.dialog_progress);
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
            dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog2.setOnCancelListener(this);
        } else {
            this.mProgressDialog = dialog;
            dialog.setOnCancelListener(this);
        }
        if (z) {
            this.mProgressDialog.setOnKeyListener(new eb3(i, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        onCancel(null);
        return true;
    }

    public void handleRetainedTask(Object obj) {
        if (obj instanceof Task) {
            Task task = (Task) obj;
            this.mAsyncTask = task;
            task.setProgressTracker(this);
        }
    }

    public boolean isWorking() {
        return this.mAsyncTask != null;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.mProgressDialog.dismiss();
        this.mAsyncTask.cancel(true);
        this.mTaskCompleteListener.onTaskComplete(this.mAsyncTask);
        this.mAsyncTask = null;
    }

    @Override // ru.cprocsp.ACSP.tools.wait_task.IProgressTracker
    public void onComplete() {
        this.mProgressDialog.dismiss();
        this.mTaskCompleteListener.onTaskComplete(this.mAsyncTask);
        this.mAsyncTask = null;
    }

    @Override // ru.cprocsp.ACSP.tools.wait_task.IProgressTracker
    public void onProgress(String str) {
        if (!this.mProgressDialog.isShowing()) {
            this.mProgressDialog.show();
        }
        if (str != null) {
            Dialog dialog = this.mProgressDialog;
            if (dialog instanceof ProgressDialog) {
                ((ProgressDialog) dialog).setMessage(str);
            }
        }
    }

    public Object retainTask() {
        Task task = this.mAsyncTask;
        if (task != null) {
            task.setProgressTracker(null);
        }
        return this.mAsyncTask;
    }

    public void setupTask(Task task) {
        this.mAsyncTask = task;
        task.setProgressTracker(this);
        this.mAsyncTask.execute(new Void[0]);
    }

    public AsyncTaskManager(Context context, OnTaskCompleteListener onTaskCompleteListener) {
        this(context, onTaskCompleteListener, null, false);
    }

    public AsyncTaskManager(Context context, OnTaskCompleteListener onTaskCompleteListener, Dialog dialog) {
        this(context, onTaskCompleteListener, dialog, false);
    }
}
